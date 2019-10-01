package Tugas2;
import java.util.Scanner;
public class MatriksMain {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        MatriksHitungBF HitungBF = new MatriksHitungBF();
        System.out.println("Masukkan nilai Matriks ke 1 = ");
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                System.out.print("Indeks ke - "+i+j+" : ");
                HitungBF.arr1[i][j] = sc.nextInt();
            }
            System.out.println(" ");
        }
        
        System.out.println("Masukkan nilai Matriks ke 2 = ");
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                System.out.print("Indeks ke - "+i+j+" : ");
                HitungBF.arr2[i][j] = sc.nextInt();
    }
            System.out.println(" ");
}
        System.out.println("Matriks ke 1 = ");
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                System.out.print(HitungBF.arr1[i][j]+"\t");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
          System.out.println("Matriks ke 2 = ");
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                System.out.print(HitungBF.arr2[i][j]+"\t");
            }
            System.out.println(" ");
        }
        HitungBF.HitungMatriksBF();
        HitungBF.TampilHasil();
 }
}
