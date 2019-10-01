package PboO;

import java.util.Scanner;

public class MainThemePark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AttributThemePark attributThemePark = new AttributThemePark();
        TesKategori tesKategori = new TesKategori();
        
        System.out.println("Verifikasi Wahana");
        System.out.println("=========================================================");
        System.out.print("Masukkan tinggi badan \t\t: ");
        attributThemePark.tb = sc.nextInt();
        System.out.print("Masukkan berat badan \t\t: ");
        attributThemePark.bb = sc.nextInt();
        System.out.print("Masukkan kategori kendaraan \t: ");
        attributThemePark.k = sc.nextInt();
        System.out.println("=========================================================");
        System.out.print("Status \t\t\t\t: ");
        int hasil = tesKategori.tesKategori(attributThemePark.tb, attributThemePark.bb, attributThemePark.k);
        
        if (hasil == -1) {
            System.out.println("TB/BB/Kategori Salah!");
        }else if (hasil > 0) {
            System.out.println("Boleh");
        }else{
            System.out.println("Tidak Boleh");
        }
        System.out.println("");
    }
}
