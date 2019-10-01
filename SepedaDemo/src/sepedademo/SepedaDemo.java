package sepedademo;
public class SepedaDemo {
    public static void main(String[] args){
        Sepeda spd1 = new Sepeda();
        Sepeda spd2 = new Sepeda();
        SepedaGunung spd3 = new SepedaGunung();
        
        spd1.setMerek("Polygone");
        spd1.tambahKecepatan(10);
        spd1.gantiGear(2);
        spd1.warna("Merah");
        spd1.cetakStatus();
        
        spd2.setMerek("Wim Cycle");
        spd2.tambahKecepatan(10);
        spd2.gantiGear(2);
        spd2.warna("Biru");
        spd2.tambahKecepatan(10);
        spd2.gantiGear(3);
        spd2.warna("Biru");
        spd2.cetakStatus();
        
        spd3.setMerek("Klinee");
        spd3.tambahKecepatan(5);
        spd3.gantiGear(7);
        spd3.warna("Ungu");
        spd3.setTipeSuspensi("Gas suspension");
        spd3.cetakStatus();
    }
}
