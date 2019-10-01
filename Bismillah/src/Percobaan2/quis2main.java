package Percobaan2;
import java.util.Scanner;
public class quis2main {
    public static void main (String[]args){
        quis2 m[] = new quis2[5];
        Scanner sc = new Scanner (System.in);
        for (int i=0; i<5;i++){
            m[i] = new quis2();
            System.out.println("Mahasiswa ke "+(i+1));
        System.out.print("Masukkan uas nilai mahasiswa : ");
        m[i].nilaiuas = sc.nextInt();
        System.out.print("Masukkan uts nilai mahasiswa : ");
        m[i].nilaiuts = sc.nextInt();
        System.out.print("Masukkan kuis nilai mahasiswa : ");
        m[i].nilaikuis = sc.nextInt();
        }
        for (int i =0 ; i<5; i++){
            System.out.println("Mahasiswa ke "+(i+1));
        System.out.println("Nilai akhir Mahasiswa  "+(i+1)+ " = " +m[i].nilaiakhir());
        System.out.println("Predikat mahasiswa "+m[i].predikat());
        }
        int max = 0;
        int t = 0;
               for (int i= 0; i<5; i++){
                   if (m[i].nilaiakhir()>max){
                       max = (int) m[i].nilaiakhir();
                       t = i+1; 
                   }
               }
               System.out.println("Mahasiswa Nilai Terbesar = " +max+" Mahasiswa  "+t);
    }
    
}
