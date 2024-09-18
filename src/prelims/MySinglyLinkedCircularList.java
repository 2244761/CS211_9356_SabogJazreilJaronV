package prelims;

/*
  Name: Sabog, Jazreil Jaron V.
  Date: September 18, 2024
  Class Code: 9356B CS 211L
  Individual Prelim Project
 */

import java.util.NoSuchElementException;

public class MySinglyLinkedCircularList<T> {
    /**
     * Head Node Attribute
     */
    private SinglyLinkedListNode<T> head;

    /**
     * Tail Node Attribute
     */
    private SinglyLinkedListNode<T> tail;

    /**
     * Default Constructor
     */
    public MySinglyLinkedCircularList() {
        head = null;
        tail = null;
    }

    /**
     * Constructs a circular singly linked list with the specified head and tail nodes
     * @param head the head node of the list
     * @param tail the tail node of the list
     */
    public MySinglyLinkedCircularList(SinglyLinkedListNode<T> head, SinglyLinkedListNode<T> tail) {
        this.head = head;
        this.tail = tail;
    }

    /**
     * Gets the head node of the list
     * @return the head node
     */
    public SinglyLinkedListNode<T> getHead() {
        return head;
    }

    /**
     * Gets the tail node of the list
     * @return the tail node
     */
    public SinglyLinkedListNode<T> getTail() {
        return tail;
    }

    /**
     * Inserts a node at the start of the list
     * @param data the data to inserted to the new node to be inserted at the start of the list
     */
    public void insertStart(T data) {
        SinglyLinkedListNode<T> newNode = new SinglyLinkedListNode<>(data, null);
        newNode.setNext(head);

        if (head == null) {
            head = newNode;
            tail = head;
        } else {
            tail.setNext(newNode);
            head = newNode;
        }
    }

    /**
     * Inserts a node at the end of the list
     * @param data the data to inserted to the new node to be inserted at the end of the list
     */
    public void insertEnd(T data) {
        SinglyLinkedListNode<T> newNode = new SinglyLinkedListNode<>(data, null);
        newNode.setNext(head);

        if (head == null) {
            head = newNode;
            tail = head;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    /**
     * Removes the head node from the list
     * @throws NoSuchElementException if the list is empty
     */
    public void removeStart() {
        SinglyLinkedListNode<T> nodeToRemove = head;

        if (nodeToRemove == null) throw new NoSuchElementException("The List is empty");

        head = nodeToRemove.getNext();

        if (nodeToRemove == tail) tail = null;
    }

    /**
     * Removes the tail node from the list
     * @throws NoSuchElementException if the list is empty
     */
    public void removeEnd() {
        SinglyLinkedListNode<T> nodeToRemove = tail;

        if (nodeToRemove == null) throw new NoSuchElementException("The List is empty");
        tail = head;

        while (tail.getNext() != nodeToRemove) tail = tail.getNext();
        tail.setNext(head);

    }

    /**
     * Removes the first occurrence that matches the given data from the list
     * @param data the data to be removed
     * @throws NoSuchElementException if the list is empty
     */
    public void removeByData(T data) {
        if (head == null) throw new NoSuchElementException("The List is empty");
        SinglyLinkedListNode<T> nodeToRemove = null;
        SinglyLinkedListNode<T> currentNode = head;

        do {
            if (currentNode.getData().equals(data)) {
                if (nodeToRemove == null) head = currentNode.getNext();
                else nodeToRemove.setNext(currentNode.getNext());
                break;
            }
            nodeToRemove = currentNode;
            currentNode = currentNode.getNext();
        } while (currentNode != head);
    }

    /**
     * Checks if the list is empty
     * @return true if the list is empty, otherwise false
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Returns a string representation of the list
     */
    @Override
    public String toString() {
        if (head == null) return "List is Empty";
        StringBuilder result = new StringBuilder("[");
        SinglyLinkedListNode<T> currentNode = head;

        do {
            result.append(currentNode.getData()).append(",");
            currentNode = currentNode.getNext();
        } while (currentNode != head);

        result.append("]");
        return result.toString();
    }
}
