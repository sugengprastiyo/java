package faktorial;
import java.util.Scanner;
public class FaktorialMain {
  public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        Faktorial fakObjek = new Faktorial();
        System.out.print("Masukkan jumlah n Faktorial :");
        fakObjek.nilai = sc.nextInt();
        
            fakObjek.faktorialBF();
            fakObjek.faktorialDC();
    }
}