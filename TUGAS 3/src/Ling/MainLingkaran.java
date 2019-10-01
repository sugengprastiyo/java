package Ling;
import java.util.Scanner;
public class MainLingkaran {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     Lingkaran l1 = new Lingkaran();    
        System.out.print("Masukkan jari-jari =  ");
        l1.r=sc.nextDouble();
        
        System.out.println("______________________");
        System.out.println("Luas lingkaran = "+l1.hitungLuas(l1.r));
        System.out.println("Keliling lingkaran = "+l1.hitungKeliling(l1.r));
        
        System.out.println("______________________");
        l1.tampilData();
        
        

    }
}
