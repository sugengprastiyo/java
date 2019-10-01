package Ling;
public class Lingkaran {
    double r;
    double phi = 3.14;
    double hitLuas, hitKel;
    
    public double hitungLuas(double r){
        hitLuas = phi*r*r;
        return hitLuas;
    }
    public double hitungKeliling(double r){
        hitKel = 2*phi*r;
        return hitKel;
    }
    public void tampilData(){
        System.out.println("Luas Lingkaran "+hitLuas);
        System.out.println("Keliling Lingkaran "+hitKel);
    }
            
        }
