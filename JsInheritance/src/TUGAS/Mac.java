package TUGAS;
public class Mac extends Leptop{
    public String security;
    
    public Mac(){
        
    }

    public Mac(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei,String security) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.security = security;
    }
    public void tampilMac(){
    super.tampilLeptop();
    System.out.println("Security    ="+security);
}
}
