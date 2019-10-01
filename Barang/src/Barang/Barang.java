package Barang;
public class Barang {
    public int hargaSatuan, jumlah;
    public String nama;
    public String Barang;

    int hitungHargaTotal()
    {
        return hargaSatuan*jumlah;
    }
    int hitungDiskon(int hitungHargaTotal)
    {
       int diskon ;
       if (hitungHargaTotal >100000){
           diskon = hitungHargaTotal*10/100;
           return diskon;
       }else if(hitungHargaTotal >=50000 && hitungHargaTotal <=100000){
           diskon = hitungHargaTotal*5/100;
           return diskon;
       }else{
           diskon = 0;
           return diskon;
       }
       
          
       }
    int hitungHargaBayar(int hitungHargaTotal, int diskon)
    {
        return hitungHargaTotal - diskon;
    }

    }