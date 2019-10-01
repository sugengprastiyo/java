package JajarGenjang;
import java.util.Scanner;
public class JajarGenjangMain {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        JajarGenjang[] arr1 = new JajarGenjang[5];
        
        for (int i=0;i<5;i++){
            arr1 [i] = new JajarGenjang();
            System.out.print("Masukkan Tinggi JajarGenjang ke"+i+"\t =");
            arr1[i].tinggi= sc.nextInt();
            System.out.print("Masukkan Panjang JajarGenjang ke"+i+"\t=");
            arr1[i].panjang=sc.nextInt();
            System.out.print("Masukkan Sisi Miring JajarGenjang ke"+i+"\t=");
            arr1[i].sisiMiring=sc.nextInt();
        }
        for (int i=0;i<5;i++){
            System.out.println("Luas jajar genjang ke "+i+"\t="+arr1[i].hitungLuas());
            System.out.println("Keliling jajar genjang ke "+i+"\t="+arr1[i].hitungKeliling());
        }
    }
}
