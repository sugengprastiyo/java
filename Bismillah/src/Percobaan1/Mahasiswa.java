package Percobaan1;
public class Mahasiswa {
    public String nama;
    public float nilaikuis;
    public float nilaiuts;
    public float nilaiuas;
    
    public float nilaiakhir(){
        float nilaiakhir = 0;
        nilaiakhir =  (float) ((float)nilaikuis*0.2 + (float)nilaiuts*0.4 +(float) nilaiuas*0.4);
        return nilaiakhir;
    }
     public char predikat(){
         char predikat ;
         if (nilaiakhir()<=100 && nilaiakhir()>=80){
             return predikat = 'B';
     }else if (nilaiakhir()<=79 && nilaiakhir()>=50){
             return predikat ='C';
     }else {
         return predikat ='K';
         }
     }
    }
