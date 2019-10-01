package PboTgs4;
import java.util.Scanner;
public class MainSuhu {
    public static void main(String[] args) {
        Scanner scChar = new Scanner(System.in);
        Scanner scFloat = new Scanner(System.in);
        AtributSuhu atributSuhu = new AtributSuhu();
        KonversiSuhu konversiSuhu = new KonversiSuhu();
        
        System.out.println("Konversi Suhu");
        System.out.println("C -> R / C -> F / C -> K");
        System.out.println("==================================");
        System.out.print("Masukkan suhu (C) \t: ");
        atributSuhu.t = scFloat.nextFloat();
        System.out.print("Masukkan satuan tujuan \t: ");
        atributSuhu.satuan = scChar.next().charAt(0);
        System.out.println("==================================");
        float hasil = konversiSuhu.konversiSuhu(atributSuhu.t, atributSuhu.satuan);
        if (hasil != 0) {
            System.out.println("Hasil konversi \t: "+hasil);
        }else{
            System.out.println("Satuan Salah!");
        }
    }
    
}
