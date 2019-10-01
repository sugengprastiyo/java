package TUGAS3;

public class Node {
    int nilai;
    String nama;
    
    Node prev, next;
    
    Node (Node prev, int nilai, String nama, Node next){
        this.prev=prev;
        this.nilai=nilai;
        this.nama=nama;
        this.next=next;
    }

    Node(Node current, String nm, int nl, Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    public void printMhs(){
        System.out.println("Nama : "+nama);
        System.out.println("Nilai : "+nilai);
    }
}

