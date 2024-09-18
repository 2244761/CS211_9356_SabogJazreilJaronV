package prelims;

import java.util.NoSuchElementException;

/*
  Name: Sabog, Jazreil Jaron V.
  Date: September 18, 2024
  Class Code: 9356B CS 211L
  Individual Prelim Project
 */
public class MyDoublyLinkedCircularList<T> extends DoublyLinkedListNode<T>{
    /**
     * Head Node Attribute
     */
    private DoublyLinkedListNode<T> head;

    /**
     * Tail Node Attribute
     */
    private DoublyLinkedListNode<T> tail;

    /**
     * Default Constructor
     */
    public MyDoublyLinkedCircularList() {
        head = null;
        tail = null;
    }

    /**
     * Constructs a doubly linked list with the specified head and tail nodes
     * @param head the head node of the list
     * @param tail the tail node of the list
     */
    public MyDoublyLinkedCircularList(DoublyLinkedListNode<T> head, DoublyLinkedListNode<T> tail) {
        this.head = head;
        this.tail = tail;
    }

    /**
     * Gets the head node of the list
     * @return the head node
     */
    public DoublyLinkedListNode<T> getHead() {
        return head;
    }

    /**
     * Gets the tail node of the list
     * @return the tail node
     */
    public DoublyLinkedListNode<T> getTail() {
        return tail;
    }

    /**
     * Inserts a node at the start of the list
     * @param data the data to inserted to the new node to be inserted at the start of the list
     */
    public void insertStart(T data) {
        DoublyLinkedListNode<T> newNode = new DoublyLinkedListNode<>(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.setNext(newNode);
            newNode.setPrevious(newNode);
        } else {
            newNode.setNext(head);
            head.setPrevious(newNode);
            head = newNode;
            tail.setNext(head);
        }
    }

    /**
     * Inserts a node at the end of the list
     * @param data the data to inserted to the new node to be inserted at the end of the list
     */
    public void insertEnd(T data) {
        DoublyLinkedListNode<T> newNode = new DoublyLinkedListNode<>(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.setNext(newNode);
            newNode.setPrevious(newNode);
        } else {
            newNode.setPrevious(tail);
            tail.setNext(newNode);
            tail = newNode;
            head.setPrevious(tail);
        }
    }

    /**
     * Removes the tail node from the list
     * @throws NoSuchElementException if the list is empty
     */
    public void removeEnd() {
        DoublyLinkedListNode<T> nodeToRemove = tail;

        if (nodeToRemove == null) throw new NoSuchElementException("The List is empty");

        if (nodeToRemove == head) {
            head = null;
            tail = null;
        } else {
            tail = nodeToRemove.getPrevious();
            tail.setNext(head);
            head.setPrevious(tail);
        }
    }

    /**
     * Removes the head node from the list
     * @throws NoSuchElementException if the list is empty
     */
    public void removeStart() {
        DoublyLinkedListNode<T> nodeToRemove = head;

        if (nodeToRemove == null) throw new NoSuchElementException("The List is empty");

        if (nodeToRemove == tail) {
            head = null;
            tail = null;
        } else {
            head = nodeToRemove.getNext();
            head.setPrevious(tail);
            tail.setNext(head);
        }
    }

    /**
     * Removes the first occurrence that matches the given data from the list
     * @param data the data to be removed
     */
    public void removeByData(T data) {
        DoublyLinkedListNode<T> nodeToRemove = null;
        DoublyLinkedListNode<T> currentNode = head;

        while (currentNode != null) {
            if (currentNode.getData().equals(data)) {
                nodeToRemove = currentNode;
                break;
            }
            currentNode = currentNode.getNext();
        }

        if (nodeToRemove == null) return;

        if (nodeToRemove == head) {
            removeStart();
        } else if (nodeToRemove == tail) {
            removeEnd();
        } else {
            DoublyLinkedListNode<T> nextNode = nodeToRemove.getNext();
            DoublyLinkedListNode<T> previousNode = nodeToRemove.getPrevious();
            nextNode.setPrevious(previousNode);
            previousNode.setNext(nextNode);
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
        DoublyLinkedListNode<T> currentNode = head.getNext();

        while (currentNode != null) {
            result += ", " + currentNode.getData();
            currentNode = currentNode.getNext();
        }
        result += "]";
        return result;
    }
}
