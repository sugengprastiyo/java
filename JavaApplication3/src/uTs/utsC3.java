package uTs;
class utsC3 {
    String namabarang;
    int kodeB, jmlBdTK, StokBdgd;
    
    utsC3 (String n, int t, int u, int i ){
        namabarang = n;
        kodeB = t;
        jmlBdTK = u;
        StokBdgd = i;
        
    }
    void tampil (){
        System.out.println("Kode Barang = "+kodeB);
        System.out.println("Nama Barang = "+namabarang);
        System.out.println("Jumlah Barang Di toko = "+jmlBdTK);
        System.out.println("Stok Barang di Gudang  = "+StokBdgd);
    }
}
