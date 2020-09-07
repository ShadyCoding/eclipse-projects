package Queue;

public class Queue {
    private long[] queueArray; //
    private int maxSize; //initializes the set number of slots
    private int front; // this will be index position for the element in the front
    private int rear;//  this will be the index position for the element in the back of the line
    private int nItems; // counter to maintain the number of items in the queue

    public Queue(int size){
        this.maxSize=size;
        this.queueArray = new long[maxSize];
        this.front = 0;//index position of the first slot of the array
        this.rear = -1; // there is no element in the array yet to be considered as the last item
        this.nItems = 0;
    }

    public void insert(long insertValue){
        if (rear == maxSize-1){
            rear = -1;
        }
        ///if (isFull()){
           // System.out.println("Queue is full");
        //}else{
            rear++;
            queueArray[rear]=insertValue;
            nItems++;
        //}
    }

    public long remove(){
        long temp = queueArray[front];
        front++;
        if(front==maxSize)
            front=0;
        nItems--;
        return temp;
    }

    public long peak(){
        return queueArray[front];
    }

    public boolean isEmpty(){
        return nItems == 0;
    }

    public boolean isFull(){
        return (nItems == maxSize);
    }

    public void printQueue(){
        System.out.print("[ ");
        for (int i = 0; i < queueArray.length; i++) {
            System.out.print(queueArray[i]+" ");
        }
        System.out.print("]");
    }


}
