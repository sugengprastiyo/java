package brg;
import java.util.Scanner;
public class MainBarang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Barang b1 = new Barang();
        
        System.out.print("Masukkan Kode Barang = ");
        b1.kode = sc.nextLine();
        System.out.print("Masukkan Nama Barang = ");
        b1.namaBarang = sc.nextLine();
        System.out.print("Masukkan Harga Dasar =  ");
        b1.hargaDasar = sc1.nextInt();
        System.out.print("Masukkan Diskon =  ");
        b1.diskon = sc1.nextInt();
        System.out.println("___________________________");
        b1.tampilData();
    }
}
