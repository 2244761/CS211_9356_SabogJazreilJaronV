package prelims;

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

    public DoublyLinkedListNode(T data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }

    public T getData() {
        return data;
    }

    public DoublyLinkedListNode<T> getNext() {
        return next;
    }

    public DoublyLinkedListNode<T> getPrevious() {
        return previous;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setPrevious(DoublyLinkedListNode<T> previous) {
        this.previous = previous;
    }

    public void setNext(DoublyLinkedListNode<T> next) {
        this.next = next;
    }

    public boolean equals(DoublyLinkedListNode<T> otherNode) {
        return this == otherNode;
    }
}
