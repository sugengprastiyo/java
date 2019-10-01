package Tugas;
import java.util.Scanner;
public class PreFixMain {
    public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    String P,Q;
    System.out.println("Masukkan Ekspresi : ");
    Q = sc.nextLine();
    Q = Q.trim();
    Q = "("+Q;
    
    int total = Q.length();
    PreFixx pf =new PreFixx(total);
    String balik = pf.balik(Q);
    P = pf.convert(balik);
    String HasilAkhir = pf.HasilAkhir(P);
        System.out.println("Prefix:\n"+HasilAkhir);
    
    }
}
