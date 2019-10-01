package TiketKereta;
public class DaftarTketKrt {
    int kodeKrt;
    String NamaKrt;
    int KuotatktKrt;
    int JmlPembelianTkt;
    int KuotaSisa;
    
    static void nama(int i, String n, int kt, int jmlkt, int ks){
        int kodeKrt = i;
        String NamaKrt = n;
        int KuotatktKrt = kt;
        int JmlPembelianTkt = jmlkt;
        int KuotaSisa = ks;
    }

    DaftarTketKrt(int kdTiket, String nama, int KuotaTktKereta, int JmlPembeliantiket) {
        
    }
    void tampil(){
        System.out.println("Kode Kereta = "+kodeKrt);
        System.out.println("Nama Kereta = "+NamaKrt);
        System.out.println("Tiket Sisa = "+KuotaSisa);
    }
    
}
