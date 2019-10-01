package tanahNo4;
import java.util.Scanner;
public class Tanahno4Main {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Jumlah Tanah : ");
        int Tanah = sc.nextInt();
        Tanahno4[] arrT = new Tanahno4[Tanah];
        for (int i=0;i<Tanah;i++){
        arrT[i] = new Tanahno4();
        System.out.println("Tanah Ke - "+(i+1)+"=");
        System.out.println("Panjang : ");
        arrT[i].panjang = sc.nextInt();
        System.out.println("Lebar : ");
        arrT[i].lebar = sc.nextInt();
        }
        for (int i=0;i<Tanah;i++){
        System.out.println("Luas Tanah ke "+(i+1)+"="+arrT[i].hitungJumlahTanah());
        }
        int max=0;
        int p =0;
        for (int i=0;i<Tanah;i++){
        if(arrT[i].hitungJumlahTanah()> max){
            max = arrT[i].hitungJumlahTanah();
            p=i+1;
            }
        }
        System.out.println("Tanah Terluas = Tanah " +p);
}
}