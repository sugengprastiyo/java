package Quis1;
import java.util.Scanner;
public class PegawaiMain {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        Pegawai p[] = new Pegawai[5];
        for (int i=0;i<5;i++){
            p[i] = new Pegawai();
        System.out.print("Masukkan nama "+(i+1)+" = ");
        p[i].nama = sc.next();
        System.out.print("Masukkan gaji pokok =");
        p[i].gajipokok = sc.nextInt();
        System.out.print("Masukkan jam keterlambatan = ");
        p[i].jamKeterlambatan = sc.nextInt();
        System.out.print("Masukkan jam lembur = ");
        p[i].jamLembur = sc.nextInt();
        }
        for (int i=0;i<5;i++){
        System.out.println("----Karyawan ke "+(i+1)+"----");
        System.out.println("Gaji pokok = "+p[i].gajipokok());
        System.out.println("Predikat = "+p[i].predikat());
        }
        System.out.println("---------------------");
        int max = 0;
        int t = 0;
               for (int i= 0; i<5; i++){
                   if (p[i].penampilan()>max){
                       max = (int) p[i].penampilan();
                       t = i+1; 
                   }
               }
               System.out.println("Predikat Tertinggi = " +max+" Karyawan "+t);
     int min = 1;
        int r = 0;
               for (int i= 0; i<5; i++){
                   if (p[i].penampilan()<min){
                       min = (int) p[i].penampilan();
                       r = i+1; 
                   }
               }
               System.out.println("Predikat Terendah = " +min+" Karyawan "+r);
                   
    }
    }
