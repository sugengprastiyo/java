package Quis1;
public class Pegawai {
    public String nama;
    public int jamKeterlambatan;
    public int jamLembur;
    public double gajipokok;
    public int penampilan;
    
    public double gajipokok(){
        gajipokok = (int) (gajipokok + (jamLembur*10000) - (jamKeterlambatan*5000));
        return gajipokok;
    }
    public char predikat(){
        if (penampilan()>=8){
            char predikat;
            return predikat =  'B';
        }
        else if (penampilan()<8 && penampilan()>3){
            char predikat;
            return predikat = 'C';
        }
        else {
            char predikat;
            return predikat = 'K';
         
    }
}
    public int penampilan(){
        penampilan = (int)jamLembur - jamKeterlambatan;
       return penampilan;
    }
  
    }

