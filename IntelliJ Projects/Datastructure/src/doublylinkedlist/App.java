package doublylinkedlist;

public class App {
    public static void main(String[] args){
        DoublyLinkedList linkedList = new DoublyLinkedList();
        linkedList.insertFirst(22);
        linkedList.insertFirst(44);
        linkedList.insertFirst(66);
        linkedList.insertLast(11);
        linkedList.insertLast(33);
        linkedList.insertLast(55);
        linkedList.displayForward();
        linkedList.displayBackward();
        linkedList.deletFirst();
        linkedList.deleteLast();
        linkedList.deleteKey(11);
        linkedList.displayForward();
        linkedList.insertAfter(22,77);
        linkedList.insertAfter(33,88);
        linkedList.displayForward();

    }
}
