package Nomor4;

import java.util.Scanner;

public class TestKoperasi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Anggota agt = new Anggota();

        System.out.print("Masukkan nama anggota : ");
        agt.setNama(sc1.nextLine());
        System.out.print("Masukkan Limit Pinjaman: ");
        agt.setLimitPeminjaman(sc1.nextInt());
        System.out.println("===========================================");

        System.out.print("\nMasukkan Jumlah pinjaman uang : ");
        agt.setJumlahPinjaman(sc.nextInt());
        System.out.print("Jumlah pinjaman saat ini: " + agt.getJumlahPinjaman());
        do {
            System.out.print("\n\nMasukkan Jumlah angsuran : ");
            agt.setAngsuran(sc.nextInt());
            System.out.print("Jumlah pinjaman saat ini: " + agt.getJumlahPinjaman());
            System.out.println("");
        } while (agt.getJumlahPinjaman() > 0);
    }
}
