package prelims;

public class MyDoublyLinkedList<T> extends DoublyLinkedListNode<T>{
    private DoublyLinkedListNode<T> head, tail;
    public MyDoublyLinkedList() {
        head = null;
        tail = null;
    }

    public MyDoublyLinkedList(DoublyLinkedListNode<T> head, DoublyLinkedListNode<T> tail) {
        this.head = head;
        this.tail = tail;
    }

    public DoublyLinkedListNode<T> getHead() {
        return head;
    }

    public DoublyLinkedListNode<T> getTail() {
        return tail;
    }

    public void insertStart(T data) {
        DoublyLinkedListNode<T> newNode = new DoublyLinkedListNode<>(data);
        DoublyLinkedListNode<T> currentNode = head;

        if (currentNode != null) {
            currentNode.setPrevious(newNode);
            newNode.setNext(currentNode);
        }
        head = newNode;

        if (tail == null) tail = newNode;
    }

    public void insertEnd(T data) {
        DoublyLinkedListNode<T> newNode = new DoublyLinkedListNode<>(data);
        DoublyLinkedListNode<T> currentNode = tail;

        if (currentNode != null) {
            currentNode.setNext(newNode);
            newNode.setPrevious(currentNode);
        }
        tail = newNode;

        if (head == null) head = newNode;
    }

    public void removeEnd() {
        DoublyLinkedListNode<T> nodeToRemove = tail;

        if (nodeToRemove == null) throw new NullPointerException();

        tail = nodeToRemove.getPrevious();

        if (tail != null) tail.setNext(null);

        if (nodeToRemove == head) removeStart();
    }

    public void removeStart() {
        DoublyLinkedListNode<T> nodeToRemove = head;

        if (nodeToRemove == null) throw new NullPointerException();

        head = nodeToRemove.getNext();

        if (head != null) head.setPrevious(null);

        if (nodeToRemove == tail) removeEnd();
    }

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

    public boolean isEmpty() {
        return head == null;
    }

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

// REFERENCE
// https://www.codecademy.com/learn/linear-data-structures-java/modules/doubly-linked-lists-java/cheatsheet
