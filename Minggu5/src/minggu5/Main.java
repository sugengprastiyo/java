package minggu5;
import java.util.Scanner;
public class Main {
    public static void main(String []args){
        Scanner s =new Scanner (System.in);
        Scanner s1 = new Scanner (System.in);
        DaftarMahasiswaBerprestasi data = new DaftarMahasiswaBerprestasi();
        int jumMhs = 5;
        
        for (int i = 0; i<jumMhs; i++){
            System.out.println("Mahasiswa ke = "+(i+1));
            System.out.print("Nama = ");
            String nama = s1.nextLine();
            System.out.print("Tahun Masuk = ");
            int thn = s.nextInt();
            System.out.print("Umur = ");
            int umur = s.nextInt();
            System.out.print("IPK = ");
            double ipk = s.nextDouble();
            
            Mahasiswa m = new Mahasiswa (nama, thn, umur, ipk);
            data.tambah(m);
          
        }
          
            System.out.println("Data Mahasiswa sebelum Sorting = ");
            data.tampil();
            System.out.println("Data Mahasiswa setelah sorting desc berdasar ipk =");
            data.bubbleSort();
            data.tampil();
            System.out.println("Data mahasiswa setelah sorting asc berdasar ipk = ");
            data.selectionSort();
            data.tampil();
    }
}
