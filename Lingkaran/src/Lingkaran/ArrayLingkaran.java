package Lingkaran;
import java.util.Scanner;
public class ArrayLingkaran {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        Lingkaran l1 = new Lingkaran ();
        System.out.println("Masukkan jari jari = ");
        l1.r = sc.nextInt();
        System.out.println("Luas = " + l1.hitungLuas()+ " \t Keliling =  "+l1.hitungKeliling());
        
    }
}
