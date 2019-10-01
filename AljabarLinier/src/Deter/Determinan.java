package Deter;
import java.util.Scanner;
public class Determinan {
    static Scanner sc = new Scanner (System.in);
    static Scanner sc1 = new Scanner (System.in);
    static int barisNim, kolomNim;
    static int nimAkhir = 13;
    static int arrMatriks[][] = new int [2][2];
    
    public static void Menu(){
        System.out.println("Elemen nim Akhir = "+nimAkhir);
        System.out.println("Pilih posisi nim = ");
        System.out.println("A (baris ke-1, kolom ke-1");
        System.out.println("B (baris ke-1, kolom ke-1");
        System.out.println("C (baris ke-1, kolom ke-1");
        System.out.println("D (baris ke-1, kolom ke-1");
    }
    public static void pilih(){
        do{
            System.out.println("Masukkan pilihan = ");
            char pilih = sc1.next().charAt(0);
            if (pilih == 'A' ||pilih == 'a'){
            barisNim = 0;
            kolomNim = 0;
        } else if (pilih == 'B' || pilih == 'b'){
            barisNim = 0;
            kolomNim = 1;
        } else if (pilih == 'C' || pilih == 'c'){
            barisNim = 1;
            kolomNim = 0;
        } else if (pilih == 'D' || pilih == 'd'){
            barisNim = 1;
            kolomNim = 1;
        } else {
                System.out.println("");
                System.out.println("Pilihan Salah");
                System.out.println("Silahkan input pilihan kembali");
                barisNim = -1; 
                kolomNim = -1;
        }
        }while (barisNim==-1 && kolomNim == -1);
    }
    public static void memasukanMatriks(){
        System.out.println("");
        System.out.println("Masukkan Matriks = ");
        for (int i = 0; i < 2; i++){
            for (int j= 0; j < 2; j++ ){
                if (i==barisNim && j==kolomNim){
                    arrMatriks[i][j] = barisNim;
                    System.out.println("Masukkan nilai ["+i+"] ["+j+"] : "+arrMatriks[i][j]);
                }else{
                    System.out.println("Masukkan nilai ["+i+"] ["+j+"] : ");
                    arrMatriks[i][j] = sc.nextInt();
                }
            }
        }
    }
    public static boolean ulangi(){
        System.out.println("Ulangi (Y/N) ? = ");
        char ulangi = sc1.next().charAt(0);
        System.out.println("");
        return (ulangi == 'Y' || ulangi == 'y');    
    }
    public static void tampilkanMatriks(){
        System.out.println("");
        System.out.println("Matriks awal ? = ");
        for (int i =0; i<2; i++){
            for (int j = 0; j<2; j++){
                System.out.println(arrMatriks[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    public static void prosesHasilDet(){
        int hasil = (arrMatriks[0][0]*arrMatriks[1][1]-arrMatriks[0][1]*arrMatriks[1][0]);
        System.out.println("");
        System.out.println("Determinan = "+hasil);
        
    }
    public static void main(String[]args){
        do{
            Menu();
            pilih();
            memasukanMatriks();
            tampilkanMatriks();
            prosesHasilDet();
        } while (ulangi());
    }
    
}
