package Tanah;
import java.util.Scanner;
public class TanahMain {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Jumlah Tanah : ");
        int Tanah = sc.nextInt();
        Tanah[] arrT = new Tanah[Tanah];
        for (int i=0;i<Tanah;i++){
        arrT[i] = new Tanah();
        System.out.println("Tanah Ke - "+(i+1)+"=");
        System.out.println("Panjang : ");
        arrT[i].panjang = sc.nextInt();
        System.out.println("Lebar : ");
        arrT[i].lebar = sc.nextInt();
        }
        for (int i=0;i<Tanah;i++){
        System.out.println("Luas Tanah : "+arrT[i].hitungJumlahTanah());
        }
        
}
}
