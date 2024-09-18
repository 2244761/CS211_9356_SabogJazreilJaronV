package prelims;

public class Tester {
    public static void main(String[] args) {
        Tester demo;
        try {
            demo = new Tester();
            demo.run();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.exit(0);
    }

    public void run() throws ListOverflowException {
        System.out.println("=========================");
        System.out.println("MyFixedSizeArrayList Demo");
        System.out.println("=========================");
        FixedArrayDemo();

        System.out.println("=========================");
        System.out.println("MyGrowingArrayList Demo");
        System.out.println("=========================");
        GrowingArrayDemo();

        System.out.println("=========================");
        System.out.println("MySinglyLinkedList Demo");
        System.out.println("=========================");
        SinglyListDemo();

        System.out.println("=========================");
        System.out.println("MyDoublyLinkedList Demo");
        System.out.println("=========================");
        DoublyListDemo();

        System.out.println("=========================");
        System.out.println("MySinglyLinkedCircularList Demo");
        System.out.println("=========================");
        CircularSinglyListDemo();
    }

    public void FixedArrayDemo() throws ListOverflowException {
        MyFixedSizeArrayList<String> nameList = new MyFixedSizeArrayList<>();
        nameList.insert("Jazreil");
        nameList.insert("Jaron");
        nameList.insert("Sabog");
        System.out.println(nameList.toString());
        nameList.delete("Sabog");
        System.out.println(nameList.toString());
        if (nameList.search("Jaron") == 1) System.out.println("Item found.");
        System.out.println("Size of the list is " + nameList.getSize());
        System.out.println(nameList.getElement("Jazreil"));
        System.out.println();
    }

    public void GrowingArrayDemo() throws ListOverflowException {
        MyGrowingArrayList<String> nameList = new MyGrowingArrayList<>();
        nameList.insert("Jazreil");
        nameList.insert("Jaron");
        nameList.insert("Valdez");
        nameList.insert("Sabog");
        nameList.insert("BSCS");
        System.out.println(nameList.toString());
        System.out.println("Size of the list is " + nameList.getSize());
        nameList.insert("Data Structures");
        System.out.println(nameList.toString());
        System.out.println("Size of the list is " + nameList.getSize());
        System.out.println();
    }

    public void SinglyListDemo() {
        MySinglyLinkedList<String> nameList = new MySinglyLinkedList<>();
        nameList.insertStart("Jazreil");
        nameList.insertEnd("Jaron");
        nameList.insertEnd("Sabog");
        System.out.println(nameList.toString());
        nameList.removeByData("Sabog");
        System.out.println(nameList.toString());
        System.out.println(nameList.isEmpty());
        System.out.println();
    }

    public void DoublyListDemo() {
        MyDoublyLinkedList<String> nameList = new MyDoublyLinkedList<>();
        nameList.insertStart("Jazreil");
        nameList.insertEnd("Jaron");
        nameList.insertEnd("Sabog");
        System.out.println(nameList.getHead());
        System.out.println(nameList.getTail());
        nameList.removeEnd();
        nameList.removeStart();
        System.out.println(nameList.toString());
        System.out.println(nameList.getHead());
        System.out.println(nameList.getTail());
        System.out.println();
    }

    public void CircularSinglyListDemo() {
        MySinglyLinkedCircularList<String> nameList = new MySinglyLinkedCircularList<>();
        nameList.insertStart("Mr");
        nameList.insertStart("Jazreil");
        nameList.insertStart("Jaron");
        nameList.insertStart("Sabog");
        System.out.println(nameList.toString());
        nameList.removeByData("Mr");
        System.out.println(nameList.toString());
        System.out.println();
    }
}
