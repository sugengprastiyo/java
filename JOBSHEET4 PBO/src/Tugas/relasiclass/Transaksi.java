package Tugas.relasiclass;
public class Transaksi {
    
    private Admin admin;
    private Pelanggan pelanggan;
    private Wisata wisata;
    private int tgl;
    private int bln;
    private int thn;
    private int brpOrg;
    private int brpHr;
    

    public Transaksi() {
    }

    public Transaksi( int tgl, int bln, int brpOrg, int brpHr, int thn) {
       
        this.tgl = tgl;
        this.bln = bln;
        this.thn = thn;
        this.brpOrg = brpOrg;
        this.brpHr = brpHr;
    }


    public int getTgl() {
        return tgl;
    }

    public void setTgl(int tgl) {
        this.tgl = tgl;
    }

    public int getBln() {
        return bln;
    }

    public void setBln(int bln) {
        this.bln = bln;
    }

    public Wisata getWisata() {
        return wisata;
    }

    public void setWisata(Wisata wisata) {
        this.wisata = wisata;
    }

    
    public int getThn() {
        return thn;
    }

    public void setThn(int thn) {
        this.thn = thn;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }
    
   
    public int getBrpOrg() {
        return brpOrg;
    }

    public void setBrpOrg(int brpOrg) {
        this.brpOrg = brpOrg;
    }

    public int getBrpHr() {
        return brpHr;
    }

    public void setBrpHr(int brpHr) {
        this.brpHr = brpHr;
    }
    
    public int totalHarga(){
        return brpOrg*brpHr;
    }
    public int hrgaPerOrang(){
        return totalHarga()/brpOrg;
    }
    public void infoTr(){
        System.out.println("Tanggal Berangkat: "+tgl);
        System.out.println("Bulan Berangkat: "+bln);
        System.out.println("Tahun Berangkat: "+thn);
        System.out.println("Jumlah Orang: "+brpOrg);
        System.out.println("Total Hari: "+brpHr);
    }
}
