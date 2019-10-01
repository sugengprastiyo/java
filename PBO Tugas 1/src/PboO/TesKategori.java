package PboO;

public class TesKategori {
    
    int tesKategori(int tb,int bb, int k){
        int hasil = -1;
        if (tb > 0 && bb > 0 && k >= 0 && k < 5) {
            if (tb > 100 && bb <= 150 && k > 1 && k < 5) {
                return hasil = k;
            }else if(tb <= 100 && bb <= 150 && k == 1){
                return hasil = k;
            }else if(tb <= 100 && bb > 30 && k == 2){
                return hasil = k;
            }else if(tb <= 100 && bb > 150 && k == 2){
                return hasil = k;
            }else if(tb > 100 && tb <= 200 && bb > 150 && k == 3){
                return hasil = k;
            }
            else{
                k = 0;
                return hasil = k;
            }
        }else{
            return hasil = -1;
        }
    }
}
