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
        SinglyLinkedListNode<T> currentNode = head;

        while (currentNode != null) {
            System.out.println(currentNode.getData());
            currentNode = currentNode.getNext();
        }
    }
}
