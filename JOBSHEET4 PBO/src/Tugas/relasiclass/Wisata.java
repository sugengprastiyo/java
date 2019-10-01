package Tugas.relasiclass;
public class Wisata {
    private String kWisata;
    private String Okunjung;

    public Wisata() {
    }

    public Wisata(String kWisata, String Okunjung) {
        this.kWisata = kWisata;
        this.Okunjung = Okunjung;
    }

    public String getkWisata() {
        return kWisata;
    }

    public void setkWisata(String kWisata) {
        this.kWisata = kWisata;
    }

    public String getOkunjung() {
        return Okunjung;
    }

    public void setOkunjung(String Okunjung) {
        this.Okunjung = Okunjung;
    }
    
    public void infoW(){
        System.out.println("Kota Wisata: "+kWisata);
        System.out.println("Objek Wisata: "+Okunjung);
    }
}
