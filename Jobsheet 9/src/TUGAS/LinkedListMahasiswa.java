package TUGAS;
public class LinkedListMahasiswa {
    NodeMahasiswa head;
    int size;

public LinkedListMahasiswa(){
    head = null;
    size =0;
}
public boolean isEmpty(){
return head == null;
}
public void addFirst(String nim, String nama){
head = new NodeMahasiswa(nim, nama, head);
size++;
}
 public void add(String nim,String nama, int index)throws Exception{
        if (index < 0 || index > size) {
            throw new Exception("nilai index di luar batas");
        } if (isEmpty() || index==0){//add int the first
            addFirst(nim, nama);
        } else {
            NodeMahasiswa tmp = head;
            for (int i = 1; i < index; i++) {
                tmp=tmp.next;
            }
            NodeMahasiswa next = (tmp == null) ? null : tmp.next;
            tmp.next = new NodeMahasiswa(nim,nama, next);
        }
        size++;
    }
public void addLast(String nim, String nama){
        if (isEmpty()) {
            addFirst(nim, nama);
        } else {
            //locate tmp to the last node
            NodeMahasiswa tmp = head;
            while (tmp.next!=null) {                
                tmp = tmp.next;
            }
            tmp.next = new NodeMahasiswa (nim, nama, null);
        }
       size++; 
    }
void getFirst() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linkedlist kosong");
        }
        System.out.println("");
        System.out.println("Hasil Pencarian : ");
        head.print();
        System.out.println("");
    }
void getLast() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linkedlist kosong");
        }
        NodeMahasiswa tmp = head;
        while (tmp.next!=null) {            
            tmp=tmp.next;
        }
        System.out.println("");
        System.out.println("Hasil Pencarian : ");
        tmp.print();
        System.out.println("");
    }
void get(int index) throws Exception{
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas");  
        }
        NodeMahasiswa tmp = head;
        for (int i = 0; i < index; i++) {
            tmp=tmp.next;
        }
        System.out.println("");
        System.out.println("Hasil Pencarian : ");
        tmp.print();
        System.out.println("");
    }
void remove(int index)throws Exception{
        if (isEmpty() || index>=size) {
            throw new Exception("Nilai index di luar batas");
        }
        if (index==0) {
            removeFirst();
        } else {
            NodeMahasiswa prev = head;
            NodeMahasiswa cur = head.next;
            for (int i = 1; i < index; i++) {
                prev = cur;
                cur = prev.next;
            }
            prev.next = cur.next;
            size--;
            System.out.println("Data dengan index ke-"+index+" berhasil dihapus");
        }
    }
void removeFirst()throws Exception{
        head = head.next;
        System.out.println("Data pada Index pertama berhasil dihapus");
        size--;
    }
public void clear(){
    head = null;
    size = 0;
}
void print(){
        if (!isEmpty()) {
            NodeMahasiswa tmp = head;
            System.out.println("");
            System.out.println("Daftar Mahasiswa :");
            while(tmp!=null){
                tmp.print();
                System.out.println("");
                tmp = tmp.next;
            }
        } else {
            System.out.println("LinkedList kosong");
        }
    }
public void addKey(String nim, String nama, String keyNim)throws Exception{
        int hasil = -1;
        NodeMahasiswa tmp = head;
        for (int i = 0; i < size; i++) {
            if (!tmp.nim.equalsIgnoreCase(keyNim)) {
                tmp = tmp.next;
            }else{
                hasil = 0;
            }
        }
        if (hasil == -1) {
            System.out.println("Data tidak ditemukan");
        } else {
            NodeMahasiswa next = (tmp == null) ? null : tmp.next;
            tmp.next = new NodeMahasiswa(nim, nama, next);
            size++;
        }
        
    }
    public void removeKey(String nim) throws Exception {
        if (isEmpty())
            throw new Exception("LinkedList Kosong");
        NodeMahasiswa temp = head; 
	NodeMahasiswa prev = null;  
        if (temp != null && temp.nim.equalsIgnoreCase(nim)) 
        { 
            head = temp.next;  
            return; 
        }  
        while (temp != null && !temp.nim.equalsIgnoreCase(nim)) 
        { 
            prev = temp; 
            temp = temp.next; 
        }     
        if (temp == null) return; 
        prev.next = temp.next; 
        size--;
        System.out.println("Data dengan Nim "+nim+" berhasil dihapus");
    }
public void getKey(String keyNim) throws Exception {
        if (isEmpty()){
            throw new Exception("LinkedList Kosong");
        }
        NodeMahasiswa tmp = head;
        int hasil = -1;
        for (int i = 0; i < size; i++) {
            if (!tmp.nim.equalsIgnoreCase(keyNim)) {
                tmp = tmp.next;
            }else{
                hasil = 0;
            }
        }
        if (hasil == -1) {
            throw new Exception("Data tidak di temukan");
        } else {
            System.out.println("");
            System.out.println("Hasil Pencarian : ");
            tmp.print();
            System.out.println("");
        }
    }

    



}
