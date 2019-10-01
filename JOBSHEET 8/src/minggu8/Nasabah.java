package minggu8;
public class Nasabah {
String noRekening;
String nama;

    public Nasabah(String noRek, String nm) {
        noRekening = noRek;
        nama = nm;
        
    }
    void print(){
        System.out.println("No Rekening = "+noRekening);
        System.out.println("Nama Rekening = "+nama);
    }


}
