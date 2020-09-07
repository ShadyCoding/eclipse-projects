package Queue;

public class Test {
    public static void main(String[] args){
        Queue queue = new Queue(5);
        queue.insert(12);
        queue.insert(22);
        queue.insert(32);
        queue.insert(4233);
        queue.insert(1);

        //System.out.println(queue.remove());
        System.out.println(queue.peak());
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
        queue.printQueue();
    }
}
