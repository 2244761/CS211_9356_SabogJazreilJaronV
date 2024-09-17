package prelims;

/**
 * Name: Sabog, Jazreil Jaron V.
 * Date: September 7, 2024
 * Class Code: 9356B CS 211L
 * Submission: Node.java
 */

public class SinglyLinkedListNode<T> {
    /**
     * Data Attribute
     */
    private T data;

    /**
     * Next Node Attribute
     */
    private SinglyLinkedListNode<T> next;

    /**
     * Default Constructor
     */
    public SinglyLinkedListNode() {
        data = null;
        next = null;
    }

    /**
     * Constructor that sets the data of the Node
     * @param data data that will be assigned to the node
     */
    public SinglyLinkedListNode(T data, SinglyLinkedListNode<T> next) {
        this.data = data;
        this.next = next;
    }

    /**
     * Gets the data of a Node
     * @return returns the Data of the Node
     */
    public T getData() {
        return data;
    }

    /**
     * Gets the Next Node
     * @return returns the next Node
     */
    public SinglyLinkedListNode<T> getNext() {
        return next;
    }

    /**
     * Sets the data of the Node
     * @param data data that will be assigned to the Node
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * Sets the Next Node
     * @param next the Node to be assigned to the next Node
     */
    public void setNext(SinglyLinkedListNode<T> next) {
        this.next = next;
    }

    public boolean equals(SinglyLinkedListNode<T> otherNode) {
        return this == otherNode;
    }
}
