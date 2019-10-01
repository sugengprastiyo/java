package Tugas;
import java.util.Scanner;
public class No3 {
    public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    String P,Q;
    System.out.println("Masukkan Ekspresi : ");
    Q = sc.nextLine();
    Q = Q.trim();
    
    int total = Q.length();
    No03 pf =new No03(total);
    P = pf.convert(Q);
        System.out.println("Infix:\n"+P);
    }
}
