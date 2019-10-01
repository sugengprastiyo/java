package TUGAS3;
public class doubleLinkedListTugas3 {
    Node head;
    int size;

    public doubleLinkedListTugas3() {
        head = null;
        size = 0;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void addFirst(String nm, int nl){
        if (isEmpty()) {
            head = new Node(null, nl, nm, null);
        } else {
            Node newNode = new Node(null, nl, nm, null);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    
    public void addLast(String nm, int nl){
        if (isEmpty()) {
            addFirst(nm, nl);
        }else{
            Node current = head;
            while (current.next != null) {                
                current = current.next;
            }
            Node newNode = new Node(current, nm, nl, null);
            current.next = newNode;
            size++;
        }
    }
    
    public void add(String nm, int nl, int index) throws Exception{
        if (isEmpty()) {
            addFirst(nm, nl);
        }
        if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        } else {
            Node current = head;
            int i = 0;
            while(i < index){
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node newNode = new Node(null, nm,nl, current);
                current.next = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, nm,nl, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    
    public void removeFirst()throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked list masih Kosong, tidak dapat dihapus !");
        }else if(size == 1) {
            removeLast();
        }else{
            System.out.println("Berhasil menghapus : ");
            head.printMhs();
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    
    public void removeLast()throws Exception{
        if (isEmpty()) {
            throw new Exception ("Linked list masih kosong, tidak dapat dihapus !");
        }
        if (head.next == null) {
            System.out.println("Berhasil menghapus : ");
            head.printMhs();
            head = null;
            size--;
            return;
        }
        
        Node current = head;
        while(current.next!=null){
            current = current.next;
        }
        
        System.out.println("Berhasil menghapus : ");
        current.next.printMhs();
        current.next = null;
        size--;
    }
    
    public void remove(int index) throws Exception{
        if (isEmpty() || index >= size ) {
            throw new Exception ("Nilai indeks di luar batas !");
        }
        if (index==0) {
            removeFirst();
        }else{
            Node current = head;
            int i = 0;
            while (i < index) {                
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null){
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            System.out.println("Data ke "+index+ "berhasil dihapus");
            size--;
        }
    }
    
    public void getFirst() throws Exception{
        if (isEmpty()) {
            throw new Exception ("Linked list kosong");
        }
        head.printMhs();
    }
    
    public void getLast() throws Exception{
        if (isEmpty()) {
            throw new Exception ("Linked list kosong");
        }
        Node tmp = head;
        while (tmp!=null) {            
            tmp = tmp.next;
        }
        tmp.printMhs();
    }
    
    public void get(int index) throws Exception{
        if (isEmpty() || index>=size) {
            throw new Exception ("Nilai index di luar batas!");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        tmp.printMhs();
    }    
    
    public void getIndex(String nm) throws Exception{
        if (isEmpty()) {
            throw new Exception ("Linked list kosong");
        }
        Node tmp = head;
        int i = 0;
        int hasil = -1;
        while (tmp!=null) {
            if (tmp.nama!=nm) {
                tmp = tmp.next;
                i++;
                hasil = -1;
            }else{
                hasil = i;
                break;
            }
        }
        if (hasil==-1) {
            System.out.println("Data tidak ditemukan !");
        } else {
            System.out.println("Data : "+nm+" ditemukan pada indeks ke: "+hasil);
        }
    }
    
    public void bubbleSortAsc(){
        if (isEmpty()) {
            System.out.println("Linked List masih kosong!");
        } else {
            Node i = head;
            Node j;
            int tempNilai;
            String tempNama;
            for (; i!= null; i = i.next) {
                for (j = i.next; j!=null; j = j.next) {
                    if (i.nilai > j.nilai) {
                        tempNilai = j.nilai;
                        j.nilai = i.nilai;
                        i.nilai = tempNilai;
                        tempNama = j.nama;
                        j.nama = i.nama;
                        i.nama = tempNama;
                    }
                }
            }
        } 
    }
    
    public void bubbleSortDesc(){
        if (isEmpty()) {
            System.out.println("Linked List masih kosong!");
        } else {
            Node i = head;
            Node j;
            int tempNilai;
            String tempNama;
            for (; i!= null; i = i.next) {
                for (j = i.next; j!=null; j = j.next) {
                    if (i.nilai < j.nilai) {
                        tempNilai = j.nilai;
                        j.nilai = i.nilai;
                        i.nilai = tempNilai;
                        tempNama = j.nama;
                        j.nama = i.nama;
                        i.nama = tempNama;
                    }
                }
            }
        } 
    }
    
    public int size(){
        return size;
    }
    
    public void clear(){
        head = null;
        size = 0;
    }
    
    public void print(){
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("Data Mahasiswa : ");
            while(tmp != null){
                tmp.printMhs();
                tmp = tmp.next;
            }
            System.out.println("\nJumlah data : "+size());
        } else {
            System.out.println("LinkedList masih kosong!");
        }
    }
}
