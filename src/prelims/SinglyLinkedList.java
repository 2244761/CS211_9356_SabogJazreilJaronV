package prelims;

public class SinglyLinkedList<T> {
    public SinglyLinkedListNode<T> head = null;
    public SinglyLinkedListNode<T> tail = null;
    public SinglyLinkedList() {

    }

    public SinglyLinkedListNode<T> insertData(T data) {
        SinglyLinkedListNode<T> newNode = new SinglyLinkedListNode<>(data);

        return newNode;
    }

    public void traverseLinkedList(SinglyLinkedListNode<Object> head) {


    }
}
