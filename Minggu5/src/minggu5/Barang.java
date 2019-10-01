package minggu5;
public class Barang {
    String nama;
    int jumlah;
    int hargasatuan;
    
    
    Barang(String n, int j, int hs){
       nama=n;
        jumlah=j;
        hargasatuan=hs;
    }
    
    void tampil (){
        System.out.println("Nama Barang = "+nama);
        System.out.println("Jumlah Barang = "+jumlah);
        System.out.println("Harga Satuan = "+hargasatuan);
    }
    int hitungHargaTotal(){
        int hargaTotal;
        hargaTotal = hargasatuan * jumlah ;
        return hargaTotal ;
    }
}
