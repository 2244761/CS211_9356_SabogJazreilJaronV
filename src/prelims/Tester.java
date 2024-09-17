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

        // Fixed Array
//        MyFixedSizeArrayList<String> stringList = new MyFixedSizeArrayList<>();
//
//        stringList.insert("Jaron");
//        stringList.insert("Karl");
//        stringList.insert("Christian");
//        stringList.insert("Drent");
//        stringList.insert("Crane");
//        System.out.println(stringList);
//        System.out.println(stringList.getSize());
////        System.out.println(stringList.getElement("Alvin"));
//        System.out.println(stringList.search("Drent"));
//        stringList.delete("Drent");
//        System.out.println(stringList);
//        System.out.println(stringList.getSize());

        // Growing Array
//        MyGrowingArrayList<Integer> intList = new MyGrowingArrayList<>();
//        intList.insert(1);
//        intList.insert(2);
//        intList.insert(3);
//        intList.insert(4);
//        intList.insert(5);
//        System.out.println(intList.getSize());
//        intList.insert(6);
//        System.out.println(intList);
//        System.out.println(intList.getSize());

        // SinglyLinkedList
        MySinglyLinkedList<String> FruitList = new MySinglyLinkedList<>();
        FruitList.insertStart("Banana");
        FruitList.insertStart("Apple");
        FruitList.insertStart("Watermelon");
        FruitList.insertStart("Pineapple");
        FruitList.insertStart("Coconut");
        FruitList.removeByData("Banana");

        System.out.println(FruitList.toString());

//        MyDoublyLinkedList<String> nameList = new MyDoublyLinkedList<>();
//        nameList.insertEnd("Dalos");
//        nameList.insertEnd("Miguel");
//        nameList.insertEnd("Dale");
//        nameList.insertEnd("Sugar");
//        nameList.insertEnd("Spice");
//        nameList.removeByData("Spice");
//        nameList.displayList();
    }
}
