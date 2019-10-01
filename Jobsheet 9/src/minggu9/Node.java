package tugas2;

public class Node {
    int data;
    Node prev,next;
    
    public Node(int d) {
        this.data = d;
    }
    
    int getData(){
        return data;
    }
}