package Nomor4;
public class Anggota {
    private String nama,ktp;
    private int angsuran, limitPeminjaman, pinjaman;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKtp() {
        return ktp;
    }

    public void setKtp(String ktp) {
        this.ktp = ktp;
    }

    public int getAngsuran() {
        return angsuran;
    }

    public void setAngsuran(int angsuran) {
        if(angsuran>=limitAngsuran()){
        pinjaman = pinjaman - angsuran;    
        }else{
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        }
        
    }
    public int limitAngsuran(){
        int totAng = (pinjaman*10)/100;
        return totAng; 
    }

    public int getLimitPeminjaman() {
        return limitPeminjaman;
    }

    public void setLimitPeminjaman(int limitPeminjaman) {
        this.limitPeminjaman = limitPeminjaman;
    }

    public int getJumlahPinjaman() {
        return pinjaman;
    }

    public void setJumlahPinjaman(int jumlahPinjaman) {
        if(jumlahPinjaman>limitPeminjaman){
            System.out.println("Maaf, Anda melebihi limit");
            pinjaman=0;
        }else{
        pinjaman = jumlahPinjaman;
        }
        
    }

    public int getPinjaman() {
        return pinjaman;
    }

    public void setPinjaman(int pinjaman) {
        this.pinjaman = pinjaman;
    }
}
