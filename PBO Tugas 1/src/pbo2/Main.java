package pbo2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Atribut but = new Atribut();
        System.out.println("Masukkan a = ");
        but.a=sc.nextFloat();
        System.out.println("Masukkan t =");
        but.t=sc.nextFloat();
        luasSeg LS = new luasSeg();
        System.out.println("Luas segitiga = "+LS.luassegitiga(but.a, but.t));
    }
}
