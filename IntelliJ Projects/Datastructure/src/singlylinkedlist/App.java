package singlylinkedlist;

public class App {
    public static void main(String[] args){
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
       // linkedList.insertLast(4432);
//        linkedList.deleteFirst();
        linkedList.display();

    }
}
