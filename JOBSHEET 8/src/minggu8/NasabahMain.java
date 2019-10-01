package minggu8;
import java.util.Scanner;
public class NasabahMain {
    static void menu(){
        System.out.println("Pilih operasi yang ingin dilakukan : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Print Front");
        System.out.println("5. Print Rear");
        System.out.println("6. Print Position");
        System.out.println("7. Print Data By Pos");
        System.out.println("8. Keluar");
    }
        public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int pil =0;
        System.out.println("Masukkan berapa maksimal data antrian = ");
        int m = sc.nextInt();
        QueueNasabah qobj = new QueueNasabah(m);
        do{
            menu();
            pil = sc.nextInt();
            switch (pil){
                case 1 : System.out.println("Masukkan No Rekening = ");
                         String dataIn = sc1.nextLine();
                         System.out.println("Masukkan Nama Nasabah = ");
                         String nama = sc1.nextLine();
                         Nasabah nas = new Nasabah(dataIn, nama);
                         qobj.enqueue(nas);
                    break;
                case 2 : Nasabah data0ut = qobj.dequeue();
                    if(data0ut!=null)
                        System.out.println("Data yang terambil = ");
                    data0ut.print();
                    break;
                case 3 : qobj.print();
                    break;
                case 4 : qobj.printFront();
                    break;
                case 5 : qobj.printRear();
                    break;
                case 6 : 
                    System.out.println("Masukkan No Rekening = ");
                         String caridataIn = sc1.nextLine();
                         System.out.println("Masukkan Nama Nasabah = ");
                         String carinama = sc1.nextLine();
                         Nasabah nass = new Nasabah(caridataIn, carinama);
                         qobj.printPosition(nass);
                    break;
                case 7 :
                    System.out.println("Masukkan posisi = ");
                    int posisi = sc.nextInt();
                    qobj.printDataByPos(posisi);
            }
        }   while (pil!=8);
    }
    
} 
