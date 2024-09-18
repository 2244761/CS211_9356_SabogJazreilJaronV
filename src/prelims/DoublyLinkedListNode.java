package prelims;

/**
 * Name: Sabog, Jazreil Jaron V.
 * Date: September 7, 2024
 * Class Code: 9356B CS 211L
 * Submission: Node.java
 */
public class DoublyLinkedListNode<T> {
    /**
     * Data Attribute
     */
    private T data;

    /**
     * Previous Node Attribute
     */
    private DoublyLinkedListNode<T> previous;

    /**
     * Next Node Attribute
     */
    private DoublyLinkedListNode<T> next;

    /**
     * Default Constructor
     */
    public DoublyLinkedListNode() {
        data = null;
        next = null;
        previous = null;
    }

    /**
     * Constructor that sets the data of the Node
     * @param data data that will be assigned to the node
     */
    public DoublyLinkedListNode(T data) {
        this.data = data;
        this.next = null;
        this.previous = null;
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
    public DoublyLinkedListNode<T> getNext() {
        return next;
    }

    /**
     * Gets the Previous Node
     * @return returns the previous Node
     */

    public DoublyLinkedListNode<T> getPrevious() {
        return previous;
    }

    /**
     * Sets the data of the Node
     * @param data data that will be assigned to the Node
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * Sets the Previous Node
     * @param previous the Node to be assigned to the previous Node
     */
    public void setPrevious(DoublyLinkedListNode<T> previous) {
        this.previous = previous;
    }

    /**
     * Sets the Next Node
     * @param next the Node to be assigned to the next Node
     */
    public void setNext(DoublyLinkedListNode<T> next) {
        this.next = next;
    }

    /**
     * Compares this doubly linked node to another node for equality
     * @param otherNode the other node to compare
     * @return true if this node is the same object as the other node, false otherwise
     */
    public boolean equals(DoublyLinkedListNode<T> otherNode) {
        return this == otherNode;
    }
}
