package tugas2;

public class Queue {
    int size;
    Node front,rear;

    public Queue() {
        front = null;
        rear = null;
    }
    
    boolean isEmpty(){
       return front==null;
    }
    
    void enqueue(int item){
        Node node = new Node(item);
        if (isEmpty()) {
            front = rear = node;
        } else {
            rear.next = node;
            node.prev = rear;
            rear = node;
        }
    }
    
    void dequeue(){
        if (front.next == null) {
            front = null;
            rear = null;
        } else {
            System.out.println("Data yang keluar : "+ front.data);
            front = front.next;
            front.prev = null;
        }
    }
    
    void print(){
        System.out.println("Isi Antrian : ");
        Node i = front;
        while (i!=null) {            
            System.out.print(i.getData()+"\t");
            i = i.next;
        }
        System.out.println("");
    }
}
