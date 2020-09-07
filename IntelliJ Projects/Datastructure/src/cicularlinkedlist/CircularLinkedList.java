package cicularlinkedlist;

public class CircularLinkedList {
    Node first;
    Node last;

    public CircularLinkedList (){
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty()){
            last = newNode;
        }
        newNode.next = first;
        first = newNode;
    }

    public void insertLast(int data){
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty()){
            first = newNode;
        }
        last.next = newNode; //the next value of the last node will point to the new  node
        last = newNode; // we make the new node we created to be the last node in the list
    }

    public int deleteFirst(){
        int temp = first.data;
        if (first.next == null)
            last = null;
        first = first.next; // first will point to the old's next value
        return temp;
    }

    public void display(){
        System.out.println("List first ---> last");
        Node current = first;
        while (current != null){
            current.display();
            current = current.next;
        }
        System.out.println();
    }
}
