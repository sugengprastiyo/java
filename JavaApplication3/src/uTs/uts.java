package uTs;
import java.util.Scanner;
public class uts {
    public static void main(String []args){
        Scanner s =new Scanner (System.in);
        Scanner s1 = new Scanner (System.in);
        uTSsWalayan u = new uTSsWalayan();
        System.out.println("Masukkan jumlah Barang = ");
        int jmlBarang = s.nextInt();
        u.ListBarang = new utsC3[jmlBarang];
        
        for (int i = 0; i<jmlBarang; i++){
            System.out.println("Kode Barang = ");
            int kdbarang = s.nextInt();
            System.out.print("Nama Barang = ");
            String nama = s1.nextLine();
            System.out.print("Jumlah Barang di Toko = ");
            int jmlbrngditoko = s.nextInt();
            System.out.print("Stok Barang di gudang  = ");
            int stokbrngdigd = s.nextInt();
            
            
            utsC3 v = new utsC3(nama, kdbarang, jmlbrngditoko, stokbrngdigd);
            u.tambah(v);
          
        }
          
            System.out.println("Data Barang sebelum Sorting = ");
            u.tampil();
            System.out.println("Data Barang setelah berdasar stok barang di gudang =");
            u.bubbleSort();
            u.tampil();
            
            System.out.println("Masukkan kode barang = ");
            int cari = s.nextInt();
            int hasil = u.sequentialSearch(cari);
        
        if (hasil == -1){
            System.out.println("Pencarian tidak ketemu");
        }else{
            System.out.println("Kode Barang = "+u.ListBarang[hasil].kodeB);
            
            System.out.println("Nama Barang = "+u.ListBarang[hasil].namabarang);
            
            System.out.println("Jumlah Barang di Toko = "+u.ListBarang[hasil].jmlBdTK);
            
            System.out.println("Stok Barang di gudang  = "+u.ListBarang[hasil].StokBdgd);
            
        }
            
    }
}
