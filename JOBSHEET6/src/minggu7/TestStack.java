package minggu7;
import java.util.Scanner;
public class TestStack {
    public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    Scanner sc1 = new Scanner (System.in);
    System.out.println("Masukkan jumlah angka = ");
    int angka = sc1.nextInt();
    Stack tumpuk = new Stack(angka);
    for (int i= 0; i<angka;i++){
        System.out.println("Masukkan Inputan = ");
        String input = sc.nextLine();
        tumpuk.push(input);
    }
    tumpuk.tampilkan();
    tumpuk.pop();
    tumpuk.tampilkan();
    }
}
