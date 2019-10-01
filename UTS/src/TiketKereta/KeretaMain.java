package TiketKereta;
import java.util.Scanner;
public class KeretaMain {
     public static void main(String []args){
        Scanner s =new Scanner (System.in);
        Scanner s1 = new Scanner (System.in);
        Kereta k = new Kereta();
        System.out.println("Masukkan jumlah Tiket = ");
        int jmlTiket = s.nextInt();
        k.Data = new DaftarTketKrt[jmlTiket];
        
        for (int i = 0; i<jmlTiket; i++){
            System.out.println("Kode Tiket = ");
            int kdTiket = s.nextInt();
            System.out.print("Nama Kereta = ");
            String nama = s1.nextLine();
            System.out.print("Kuota Tiket Kereta = ");
            int KuotaTktKereta = s.nextInt();
            System.out.print("Jumlah Pembelian Tiket  = ");
            int JmlPembeliantiket = s.nextInt();
            
            
            DaftarTketKrt l = new DaftarTketKrt(kdTiket, nama, KuotaTktKereta, JmlPembeliantiket);
            k.tambah(l);
          
        }
          
            System.out.println("Data Tiket sebelum Sorting = ");
            k.tampil();
            System.out.println("Data Tiket setelah berdasar sisa =");
            k.bubbleSort();
            k.tampil();
            System.out.println("Masukkan kode barang = ");
            int cari = s.nextInt();
            int hasil = k.sequentialSearch(cari);
        
        if (hasil == -1){
            System.out.println("Pencarian tidak ketemu");
        }else{
            System.out.println("Kode Tiket = "+k.Data[hasil].kodeKrt);
            
            System.out.println("Nama Kereta = "+k.Data[hasil].NamaKrt);
            
            System.out.println("Tiket Sisa = "+k.Data[hasil].KuotaSisa);
            
      
            
        }
            
    }
}
