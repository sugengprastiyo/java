package JajarGenjang;
public class JajarGenjang {
    public int tinggi, panjang, sisiMiring;
    
    public int hitungLuas(){
        return panjang*tinggi;
    }
    public int hitungKeliling(){
        return 2*(sisiMiring + sisiMiring);
    }
}
