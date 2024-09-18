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
            newNode.setNext(head);
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
            newNode.setNext(head);
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

        if (nodeToRemove == tail) removeEnd();
    }

    /**
     * Removes the tail node from the list
     * @throws NoSuchElementException if the list is empty
     */
    public void removeEnd() {
        SinglyLinkedListNode<T> nodeToRemove = tail;

        if (nodeToRemove == null) throw new NoSuchElementException("The List is empty");

        tail.setNext(null);

        if (nodeToRemove == head) removeStart();
    }

    /**
     * Removes the first occurrence that matches the given data from the list
     * @param data the data to be removed
     */
    public void removeByData(T data) {
        SinglyLinkedListNode<T> nodeToRemove = null;
        SinglyLinkedListNode<T> currentNode = head;

        while (currentNode != null) {
            if (currentNode.getData().equals(data)) {
                if (nodeToRemove == null) {
                    head = currentNode.getNext();
                } else  {
                    nodeToRemove.setNext(currentNode.getNext());
                }
                break;
            }
            nodeToRemove = currentNode;
            currentNode = currentNode.getNext();
        }
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
        String result = "[" + head.getData();
        SinglyLinkedListNode<T> currentNode = head.getNext().getNext();

        while (currentNode != head.getNext()) {
            result += ", " + currentNode.getData();
            currentNode = currentNode.getNext();
        }
        result += "]";
        return result;
    }
}
