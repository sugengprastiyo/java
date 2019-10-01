package Nilai;
import java.util.Scanner;
public class nilaiMain {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Jumlah Mahasiswa = ");
        int jumlahMahasiswa = sc.nextInt();
        Nilai[]narr = new Nilai[jumlahMahasiswa];
        for (int i=0;i<jumlahMahasiswa;i++){
        System.out.println("Mahasiswa "+(i+1)+"=");
        narr[i]=new Nilai();
        System.out.println("Nilai 1 = ");
        narr[i].nilai1=sc.nextInt();
        System.out.println("Nilai 2 = ");
        narr[i].nilai2=sc.nextInt();
        }
        for (int i=0;i<jumlahMahasiswa;i++){
        System.out.println("Nilai terbaik mahasiswa "+(i+1)+" = "+narr[i].nilaiMax());
        
        }
        
    }
    
}
