package Tugas;
import java.util.Scanner;
public class No2 {
    public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    Scanner sc1 = new Scanner (System.in);
    System.out.println("Masukkan jumlah angka = ");
    int angka = sc1.nextInt();
    No02 tumpuk = new No02 (angka);
    for (int i= 0; i<angka;i++){
        System.out.println("Masukkan Kalimat = ");
        String input = sc.nextLine();
        tumpuk.push(input);
    }
    tumpuk.tampilkan();
    }
}
