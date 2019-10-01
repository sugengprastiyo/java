package brg;
public class Barang {
    String kode, namaBarang;
    int hargaDasar;
    float diskon, hargaJual;
    public float hitungHargaJual(){
        hargaJual = hargaDasar-((diskon*hargaDasar)/(100));
        return hargaJual;
    }
    public void tampilData(){
        System.out.println("Kode Barang = "+kode);
        System.out.println("Nama Barang = "+namaBarang);
        System.out.println("Harga Dasar = "+hargaDasar);
        System.out.println("Diskon = "+diskon);
        System.out.println("Total Harga Jual = "+hitungHargaJual()); 
   }
    
}
