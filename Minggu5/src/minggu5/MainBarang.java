package minggu5;
import java.util.Scanner;
public class MainBarang {
    public static void main(String []args){
        Scanner b =new Scanner (System.in);
        Scanner b1 = new Scanner (System.in);
       KeranjangBelanja Barang = new KeranjangBelanja();
        int jumBarang = 4;
        
        for (int i = 0; i<jumBarang; i++){
            System.out.println("Barang ke  = "+(i+1));
            System.out.print("Nama Barang = ");
            String namabarang = b1.nextLine();
            System.out.print("Jumlah Barang = ");
            int jumlah = b.nextInt();
            System.out.print("Harga Satuan = ");
            int Satuan = b.nextInt();
            
            Barang hb = new Barang(namabarang, jumlah, Satuan);
            Barang.tambah(hb);
          
        }
          
            System.out.println("Data Mahasiswa sebelum Sorting = ");
            Barang.tampil();
            System.out.println("Data Barang setelah sorting asc berdasar harga satuan  =");
            Barang.bubbleSort();
            Barang.tampil();
            System.out.println("Data Barang setelah sorting asc berdasar harga total  = ");
            Barang.selectionSort();
            Barang.tampil();
             System.out.println("Data Barang setelah sorting asc berdasar jumlah barangl  = ");
            Barang.mergeSort(0,3);
            Barang.tampil();
    }
}
