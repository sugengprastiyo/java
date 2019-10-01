package game;
import java.util.Scanner;
public class TestPeminjaman {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        Peminjaman p1 = new Peminjaman();
        System.out.print("Masukkan ID Member = ");
        p1.id = sc1.nextInt();
        System.out.print("Masukkan Nama Member = ");
        p1.namaMember = sc.nextLine();
        System.out.print("Masukkan Nama Game = ");
        p1.namaGame = sc.nextLine();
        
        
        System.out.println("_________________________");
        System.out.print("Lama Sewa = ");
        p1.sewa = sc1.nextInt();
        System.out.print("Harga Game = ");
        p1.hargaGame = sc1.nextInt();
        System.out.println("_________________________");
        System.out.println("HARGA TOTAL = " +p1.totHarga());
        System.out.println("_________________________");
        p1.tampil();
    }
    
}
