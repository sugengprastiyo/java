package Percobaan1;
import java.util.Scanner;
public class MahasiswaMain {
    public static void main (String[]args){
        Mahasiswa m = new Mahasiswa();
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Masukkan uas nilai mahasiswa : ");
        m.nilaiuas = sc.nextInt();
        System.out.println("Masukkan uts nilai mahasiswa : ");
        m.nilaiuts = sc.nextInt();
        System.out.println("Masukkan kuis nilai mahasiswa : ");
        m.nilaikuis = sc.nextInt();
        
        System.out.println("Nilai uas mahasiswa = "+m.nilaiuas);
        System.out.println("Nilai uts mahasiswa = "+m.nilaiuts);
        System.out.println("Nilai kuis mahasiswa = "+m.nilaikuis);
        
        System.out.println("Nilai akhir Mahasiswa : "+m.nilaiakhir());
        System.out.println("Predikat mahasiswa "+m.predikat());
    }
    
}
