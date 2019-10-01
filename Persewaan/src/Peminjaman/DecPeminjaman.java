package Peminjaman;
import java.util.Scanner;
public class DecPeminjaman {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        Peminjaman p1 = new Peminjaman();
        System.out.println("id = ");
        p1.id = sc.nextInt();
        System.out.println("Lama Hari = ");
        p1.lamaHari = sc.nextInt();
        System.out.println("Harga Sewa Perhari = ");
        p1.hargaSewaPerhari = sc.nextInt();
        System.out.println("Nama Member = ");
        p1.namaMember = sc.next();
        System.out.println("Nama Game = ");
        p1.namaGame = sc.next();
        p1.tampilData();
        System.out.println("Total = "+p1.hitungPersewaan());
    
    }
}
