package cicularlinkedlist;

import singlylinkedlist.SinglyLinkedList;

public class App {
    public static void main(String[] args){
        CircularLinkedList linkedList = new CircularLinkedList();
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
        linkedList.insertLast(4432);
//        linkedList.deleteFirst();
        linkedList.display();

    }
}
