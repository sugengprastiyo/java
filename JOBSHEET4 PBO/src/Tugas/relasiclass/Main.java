package Tugas.relasiclass;
public class Main {
    public static void main(String[] args) {
        Admin adm = new Admin("Oktaviano Andy", 123);
        
        Pelanggan p = new Pelanggan();
        p.setnPelanggan("Bejo Suryadi");
        p.setNoPelanggan(0263764);
        p.setAlamatPelanggan("Jl Kenari Kota Blitar");
        Wisata w = new Wisata();
        w.setkWisata("Surabaya");
        w.setOkunjung("Kenjeran");
        Transaksi tr = new Transaksi();
        tr.setTgl(30);
        tr.setBln(01);
        tr.setThn(2007);
        tr.setBrpHr(2);
        tr.setBrpOrg(5);
        System.out.println("===========KWITANSI PEMBAYARAN===========");
        adm.infoA();
        System.out.println("======================================");
        p.infoP();
        w.infoW();
        tr.infoTr();
        System.out.println("======================================");
        System.out.println("Pemberangkatan: Tanggal "+tr.getTgl()+" Bulan "+tr.getBln()+" Tahun "+tr.getThn());
        System.out.println("Harga Total = "+tr.totalHarga()+"00000");
        System.out.println("Harga PerOrang = "+tr.hrgaPerOrang()+"00000");
        
    }
}
