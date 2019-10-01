package minggu8;
public class Queue {
    int max, size, front, rear;
    int[] q;
    
    Queue(int m){
        max = m;
        create();
    }
    void create(){
        q= new int [max];
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
        if (size==max)
            return true;
        else 
            return false;
    }
    void enqueue (int data){
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
            q[rear] = data;
            size++;
        }
    }
    int dequeue(){
        int data = 0;
        if(isEmpty()){
            System.out.println("Antrian Kosong!!!");
        }else{
            data = q[front];
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
        return data;
    }
    void print(){
        if(isEmpty()){
            System.out.println("Antrian Kosong!!!");
        }else{
            int i = front;
            while (i!=rear){
                System.out.println(q[i]+"-");
                i=(i+1)%max;
            }
            System.out.println(q[i]+" ");
            System.out.println("Jumlah Antrian = "+size);
        }
    }
    void printFront(){
        System.out.println("Data yang berada di barisan terdepan adalah = "+q[front]);
    }
    void printRear(){
        System.out.println("Data yang berada di barisan terakhir adalah = "+q[rear]);
    }
    void printPosition(int data){
        int hasil = -1;
        int i = front;
        while (i!=rear){
            if (q[i] == data)
                hasil = i;
                i=(i+1)%max;
            }
        if (q[i] == data)
                hasil = i;
        if (hasil == -1)
        System.out.println("PENCARIAN TIDAK ADA ");
        else 
            System.out.println("PENCARIAN DI TEMUKAN "+hasil);
           
    }
    void printDataByPos(int position){
       int hasil = -1;
        int i = front;
        while (i!=rear){
            if (i == position)
                hasil = q[i];
                i=(i+1)%max;
            }
        if (i == position)
                hasil = q[i];
        if (hasil == -1)
        System.out.println("PENCARIAN TIDAK ADA ");
        else 
            System.out.println("HASIL PENCARIAN =  "+hasil);
    }
}
