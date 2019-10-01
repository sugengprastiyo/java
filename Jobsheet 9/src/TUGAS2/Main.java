package TUGAS2;
public class Main {
    public static void main(String []args){
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(8);
        queue.enqueue(6);
        queue.enqueue(10);
        queue.print();
        queue.dequeue();
        queue.print();
    }
}
