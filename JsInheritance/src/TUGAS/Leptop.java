package TUGAS;
public class Leptop extends Komputer{
    public String jnsBatrei;
    
    public Leptop(){
        
    }

    public Leptop(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsBatrei = jnsBatrei;
    }
    public void tampilLeptop(){
        super.tampilData();
        System.out.println("Jenis Baterai       ="+jnsBatrei);
    }
}
