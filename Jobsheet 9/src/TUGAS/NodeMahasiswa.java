package TUGAS;
public class NodeMahasiswa {   
        String nim;
        String nama;
        NodeMahasiswa next;
        

    public NodeMahasiswa (String nm, String n,NodeMahasiswa next) {
        this.nim = nm;
        this.nama = n;
    }
    public void print (){
        System.out.println("Nim = "+nim);
        System.out.println("Nama = "+nama);
                
    }
}