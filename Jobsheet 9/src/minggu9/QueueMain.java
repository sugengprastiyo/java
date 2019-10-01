package tugas2;

public class QueueMain {
    public static void main(String []args){
        Queue queue = new Queue();
        queue.enqueue(4);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(6);
        queue.enqueue(9);
        queue.print();
        queue.dequeue();
        queue.print();
    }
}
