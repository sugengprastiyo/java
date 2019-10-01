package Quis2;

public class Node {
    int nilai,nim;
    String nama;
    
    
    Node prev, next;
    
    Node (Node prev, int nilai,int nim, String nama, Node next){
        this.prev=prev;
        this.nilai=nilai;
        this.nama=nama;
        this.next=next;
        this.nim=nim;
    }

    Node(Node current, String nm, int nl, Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    public void printMhs(){
        System.out.println("Nama : "+nama);
        System.out.println("Nilai : "+nilai);
        System.out.println("Nim : "+nim);
    }

    
}

