package prelims;

public class MySinglyLinkedList<T> extends SinglyLinkedListNode<T> {
    public SinglyLinkedListNode<T> head = null;
    public SinglyLinkedListNode<T> tail = null;
    public MySinglyLinkedList() {

    }

    public void insertNode(T data) {
        SinglyLinkedListNode<T> newNode = new SinglyLinkedListNode<>(data, null);
        SinglyLinkedListNode<T> currentNode = head;

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            if (newNode.getData().toString().compareTo(currentNode.getData().toString()) < 0) {
                newNode.setNext(head);
                head = newNode;
            } else {
                while (currentNode.getNext() != null &&
                newNode.getData().toString().compareTo(currentNode.getNext().getData().toString()) > 0) {
                    currentNode = currentNode.getNext();
                } // end of while
                newNode.setNext(currentNode.getNext());
                currentNode.setNext(newNode);
            } // end of second if else statement
        } // end of first if else statement
    } // end of method

    public void displayList() {
        SinglyLinkedListNode<T> currentNode = head;

        if (head == null) System.out.println("List is empty.");

        while (currentNode != null) {
            System.out.println(currentNode.getData());
            currentNode = currentNode.getNext();
        }
        System.out.println();
    }
}
