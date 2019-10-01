/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author hunayn
 */
public class LinkedListQuiz {
    NodeQuiz head;
    int size;

    LinkedListQuiz(){
        head=null;
        size=0;
    }  

    boolean isEmpty(){
        return head==null;
    }

    void addFirst(String nama, int nim, int nilai){
        head = new NodeQuiz(nama, nim, nilai, head);
        size++;
    }

    void add(String nama, int nim, int nilai){
        if(isEmpty()){
            addFirst(nama, nim, nilai);
        }
        else{
            NodeQuiz temp=head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next=new NodeQuiz(nama, nim, nilai, null);
            size++;
        }
    }

    void tampil(){
        if(isEmpty()){
            System.out.println("Tidak ada data");
        }
        else{
            NodeQuiz temp=head;
            while(temp!=null){
                temp.mhs.tampil();
                temp=temp.next;
            }
        }
    }

    void sort(){
        if(isEmpty()){
            System.out.println("Tidak ada data");
        }
        else{
            NodeQuiz tmp=head;
            for (int i = 0; i < size-1; i++) {
                for (int j = 1; j < size-i; j++) {
                    if(tmp.mhs.nilai>tmp.next.mhs.nilai){
                        MahasiswaQuiz n = tmp.mhs;
                        tmp.mhs = tmp.next.mhs;
                        tmp.next.mhs = n;
                    }
                    tmp=tmp.next;
                }
                tmp=head;
            }
        }
    }
}
