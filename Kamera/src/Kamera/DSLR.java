package Kamera;
public class DSLR {
    private String merek;
    private String Jenissensor;
    private int BeratKamera;
    
    public void MerekKamera(String newValue){
        merek = newValue;
    }
    public void JenSensor(String newValue){
        Jenissensor = newValue;
    }
    public void BeratKam(int newValue){
        BeratKamera = newValue;
    }
    public void cetak(){
        System.out.println("Merek: "+merek);
        System.out.println("Jenis Sensor: "+Jenissensor);
        System.out.println("BeratKamera: "+BeratKamera);
    }
}
