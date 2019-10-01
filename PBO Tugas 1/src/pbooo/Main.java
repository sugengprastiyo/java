package pbooo;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Atribut tribut= new Atribut();
        System.out.println("Masukkan r = ");
        tribut.r=sc.nextDouble();
        luasLing LL= new luasLing(tribut.r);
        System.out.println("Luas Lingkaran = "+LL.hitungluas());
        
    }
}
