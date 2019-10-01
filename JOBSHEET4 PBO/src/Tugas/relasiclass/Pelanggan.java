package Tugas.relasiclass;
public class Pelanggan {
    private String nPelanggan;
    private String alamatPelanggan;
    private int noPelanggan;

    public Pelanggan() {
    }

    public Pelanggan(String nPelanggan, String alamatPelanggan, int noPelanggan) {
        this.nPelanggan = nPelanggan;
        this.alamatPelanggan = alamatPelanggan;
        this.noPelanggan = noPelanggan;
    }

    public String getnPelanggan() {
        return nPelanggan;
    }

    public void setnPelanggan(String nPelanggan) {
        this.nPelanggan = nPelanggan;
    }

    public String getAlamatPelanggan() {
        return alamatPelanggan;
    }

    public void setAlamatPelanggan(String alamatPelanggan) {
        this.alamatPelanggan = alamatPelanggan;
    }

    public int getNoPelanggan() {
        return noPelanggan;
    }

    public void setNoPelanggan(int noPelanggan) {
        this.noPelanggan = noPelanggan;
    }

    
    
    public void infoP(){
        System.out.println("Nama Pelanggan: "+nPelanggan);
        System.out.println("Nomor Pelanggan: "+noPelanggan);
        System.out.println("Alamat Penjemputan: "+alamatPelanggan);
    }
    
}
