package Nilai;
public class Nilai {
    public int nilai, nilai1, nilai2;
    
    int nilaiMax(){
        if (nilai1>nilai2){
            return nilai1;
        }else{
            return nilai2;
        }
    }
}
