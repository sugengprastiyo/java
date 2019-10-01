package Tugas1;
import java.util.Scanner;
public class PangkatMain {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        pangkat p1 = new pangkat();
        System.out.println("Masukkan nilai x : ");
        p1.x = sc.nextInt();
        System.out.println("Masukkan nilai n: ");
        p1.n = sc.nextInt();
        
        p1.pangkatBruteForce();
        System.out.println("Hasil Divide Conquer = "+p1.pangkatDivideConquer(p1.n, p1.x));
    }
    
}
