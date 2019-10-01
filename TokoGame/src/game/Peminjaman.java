package game;
public class Peminjaman {
    int id, harga, sewa, hargaGame;
    String namaMember, namaGame;
    

    public int totHarga(){
        harga= sewa*hargaGame;
        return harga;
    }
    public void tampil(){
        System.out.println("ID Member = "+id);
        System.out.println("Nama Member = "+namaMember);
        System.out.println("Nama Game = "+namaGame);
        System.out.println("Total Harga = "+totHarga());
    }
    
}
