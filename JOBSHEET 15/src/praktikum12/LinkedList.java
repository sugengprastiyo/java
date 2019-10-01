package praktikum12;

public class LinkedList {
    Node head;
    int size;
    
    public LinkedList(){
        head = null;
        size = 0;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void addFirst(int item){
        if(isEmpty())
            head = new Node (null, item, null);
        else{
            Node newNode = new Node (null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void addLast(int item){
        if(isEmpty())
            addFirst(item);
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            Node newNode = new Node (current, item, null);
            current.next = newNode;
            size++;
        }
    }
    public void add(int item, int index) throws Exception{
        if (isEmpty()) addFirst(item);
        if (index < 0 || index > size) throw new Exception("Nilai Indeks di luar batas");
        else{
            Node current = head;
            int i = 0;
            while (i< index){
                current = current.next;
                i++;
            }
            if (current.prev == null){
                Node newNode = new Node(null, item, current);
                current.prev = newNode;
                head = newNode;
            }
            else {
                Node newNode = new Node(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    public int size(){
        return size;
    }
    public void clear(){
        head = null;
        size = 0;
    }
    public void print(){
        if(!isEmpty()){
            Node tmp = head;
            while (tmp!=null){
                System.out.println(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("Berhasil diisi");
        }
        else{
            System.out.println("Linked List Kosong");
        }
    }
    public void removeFirst()throws Exception{
        if (isEmpty()) throw new Exception("Linked List masih Kosong, tidak dapat dihapus ! ");
        else if (size == 1){
            removeLast();
        }else{
            head= head.next;
            head.prev = null;
            size--;
        }
    }
    public void removeLast() throws Exception{
        if(isEmpty()) throw new Exception("Linked List masih Kosong, tidak dapat dihapus !");
        if(head.next==null){
            head = null;
            size--;
            return;
        }
        Node current = head;
        while(current.next.next != null){
            current = current.next;
        }
        current.next = null;
        size--;
    }
    public void remove (int index) throws Exception{
        if(isEmpty() || index >= size)throw new Exception("Nilai indeks di luar batas");
        if (index==0){
            removeFirst();
            
        }else{
            Node current = head;
            int i = 0;
            while (i<index){
                current = current.next;
                i++;
            }
            if(current.next == null){
                current.prev.next = null;
                
            }else if (current.prev == null){
                current = current.next;
                current.prev = null;
                head = current;
            }else{
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
        
    }
    public int getFirst()throws Exception{
        if(isEmpty()) throw new Exception("Linked List Kosong");
        return head.data;
    }
    public int getLast() throws Exception{
        if(isEmpty()) throw new Exception("Linked List Kosong");
        Node tmp = head;
        while (tmp.next != null){
            tmp = tmp.next;
        }
        return tmp.data;
    }
    public int get (int index) throws Exception{
            if(isEmpty()|| index>=size) throw new Exception("Nilai Index di Luar Batas");
        Node tmp = head;
        for (int i = 0; i< index; i++){
            tmp = tmp.next;
        }
        return tmp.data;
    }
    public void getIndex(int item) throws Exception{
        if (isEmpty()){
            throw new Exception ("Linked list Kosong");
            
        }
        Node tmp = head;
        int i = 0;
        int hasil = -1;
        while (tmp!=null){
            if(tmp.data!=item){
                tmp = tmp.next;
                i++;
                hasil = -1;
            }else{
                hasil = i;
                break;
            }
        }
        if (hasil == -1){
            System.out.println("Data tidak ditemukan !");
            
        }else {
            System.out.println("Data : "+item+"ditemukan pada indeks ke : "+hasil);
        }
    }
    public void bubbleSortAsc(){
        if (isEmpty()) {
            System.out.println("Linked List masih kosong!");
        } else {
            Node i = head;
            Node j;
            int temp;
            for (; i!= null; i = i.next) {
                for (j = i.next; j!=null; j = j.next) {
                    if (i.data < j.data) {
                        temp = j.data;
                        j.data = i.data;
                        i.data = temp;
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
            int temp;
            for (; i!= null; i = i.next) {
                for (j = i.next; j!=null; j = j.next) {
                    if (i.data > j.data) {
                        temp = j.data;
                        j.data = i.data;
                        i.data = temp;
                    }
                }
            }
        }
    }
}
