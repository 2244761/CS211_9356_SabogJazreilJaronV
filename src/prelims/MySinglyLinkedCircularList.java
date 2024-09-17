package prelims;

public class MySinglyLinkedCircularList<T> {
    private SinglyLinkedListNode<T> head;
    private SinglyLinkedListNode<T> tail;

    public MySinglyLinkedCircularList() {
        head = null;
        tail = null;
    }

    public MySinglyLinkedCircularList(SinglyLinkedListNode<T> head, SinglyLinkedListNode<T> tail) {
        this.head = head;
        this.tail = tail;
    }

    public SinglyLinkedListNode<T> getHead() {
        return head;
    }

    public SinglyLinkedListNode<T> getTail() {
        return tail;
    }

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

    public void removeStart() {
        SinglyLinkedListNode<T> nodeToRemove = head;

        if (nodeToRemove == null) throw new NullPointerException();

        head = nodeToRemove.getNext();

        if (nodeToRemove == tail) removeEnd();
    }

    public void removeEnd() {
        SinglyLinkedListNode<T> nodeToRemove = tail;

        if (nodeToRemove == null) throw new NullPointerException();

        tail.setNext(null);

        if (nodeToRemove == head) removeStart();
    }

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

    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public String toString() {
        if (head == null) return "List is Empty";
        String result = "[" + head.getData();
        SinglyLinkedListNode<T> currentNode = head.getNext();

        while (currentNode != null) {
            result += ", " + currentNode.getData();
            currentNode = currentNode.getNext();
        }
        result += "]";
        return result;
    }
}
