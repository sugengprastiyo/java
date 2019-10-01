package Kamera;
public class MainKamera {
    public static void main(String[] args){
        DSLR d1 = new DSLR();
        DSLR d2 = new DSLR();
        Mirorrless m1 = new Mirorrless();
        Mirorrless m2 = new Mirorrless();
        
        d1.MerekKamera("Canon 60D");
        d1.JenSensor("APSC");
        d1.BeratKam(755);
        d1.cetak();
        
        System.out.println("____________________");
        
        d2.MerekKamera("Canon 6D");
        d2.JenSensor("FULL FRAME");
        d2.BeratKam(770);
        d2.cetak();
        
        System.out.println("____________________");
        
        m1.MerekKamera("Sony a7");
        m1.JenSensor("FULL FRAME");
        m1.BeratKam(473);
        m1.cetak();
        
        System.out.println("____________________");
        
       m2.MerekKamera("Sony a5000");
       m2.JenSensor("APSC");
       m2.BeratKam(210);
       m2.cetak();
    }
}
