package Barang;
import java.util.Scanner;
public class DecBarang {
    public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    Barang b1= new Barang();
    
    System.out.println ("Nama = ");
    b1.Barang = sc.next();
    System.out.println("Harga Satuan = ");
    b1.hargaSatuan = sc.nextInt();
    System.out.println("Jumlah = ");
    b1.jumlah = sc.nextInt();
    System.out.println("Harga Total = "+b1.hitungHargaTotal());
    System.out.println("Diskon = "+b1.hitungDiskon(b1.hitungHargaTotal()));
    System.out.println("Harga Bayar = "+b1.hitungHargaBayar(b1.hitungHargaTotal(),b1.hitungDiskon(b1.hitungHargaTotal())));
    }
}
