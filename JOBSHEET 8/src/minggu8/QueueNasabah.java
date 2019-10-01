package minggu8;
public class QueueNasabah {
    int max;
    int front;
    int rear;
    int size;
    Nasabah [] q;

    public QueueNasabah(int mx) {
        max = mx;
        create();
    }
    void create(){
        q = new Nasabah [max];
        size = 0;
        front = rear = -1;
    }
    boolean isEmpty(){
        if (size==0)
            return true;
        else
            return false;
    }
    boolean isFull(){
        if (size == max)
            return true;
        else 
            return false;
    }
    void enqueue (Nasabah nas){
        if(isFull()){
            System.out.println("Antrian sudah penuh !!!");
        }else{
            if (isEmpty()){
                front = rear = 0;
            }else{
                if(rear==max-1){
                    rear =0;
                }else{
                    rear++;
                }
            }
            q[rear] = nas;
            size++;
        }
    }
    Nasabah dequeue(){
        Nasabah nas = null;
        if(isEmpty()){
            System.out.println("Antrian Kosong!!!");
        }else{
            nas = q[front];
            size--;
            if(isEmpty()){
                front = rear = -1;
            }else{
                if(front==max-1){
                    front =0;
                }else{
                    front++;
                }
            }
        }
        return nas;
    }
    void print(){
        if(isEmpty()){
            System.out.println("Antrian Kosong!!!");
        }else{
            int i = front;
            while (i!=rear){
                q[i].print();
                i=(i+1)%max;
            }
            q[i].print();
            System.out.println("Jumlah Antrian = "+size);
        }
    }
    void printFront(){
        q[front].print();
    }
    void printRear(){
        q[rear].print();
    }
    void printPosition(Nasabah nas){
        int hasil = -1;
        int i = front;
        while (i!=rear){
            if (q[i].noRekening.equalsIgnoreCase(nas.noRekening))
                hasil = i;
                i=(i+1)%max;
            }
        if (q[i].noRekening.equalsIgnoreCase(nas.noRekening))
                hasil = i;
        if (hasil == -1)
        System.out.println("PENCARIAN TIDAK ADA ");
        else 
            System.out.println("PENCARIAN DI TEMUKAN DI POSISI "+hasil);
           
    }
    void printDataByPos(int position){
       int hasil = -1;
        int i = front;
        while (i!=rear){
            if (i == position)
                hasil = i;
                i=(i+1)%max;
            }
        if (i == position)
                hasil = i;
        if (hasil == -1)
        System.out.println("PENCARIAN TIDAK ADA ");
        else 
            System.out.println("HASIL PENCARIAN =  "+hasil);
    }
}
