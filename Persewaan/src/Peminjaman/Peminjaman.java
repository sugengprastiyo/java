package Peminjaman;
public class Peminjaman {
    public int id, lamaHari, hargaSewaPerhari;
    public String namaMember, namaGame;
    public int hitungPersewaan;    
    public void tampilData()
    {
        System.out.println("id = "+id);
        System.out.println("lama Hari = "+lamaHari);
        System.out.println("Harga Sewa Perhari = "+hargaSewaPerhari);
        System.out.println("Nama Member = "+namaMember);
        System.out.println("Nama Game = "+namaGame);
    }
    public int hitungPersewaan()
    {
        return hargaSewaPerhari*lamaHari;
    }
}
