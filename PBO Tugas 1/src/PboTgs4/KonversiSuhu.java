package PboTgs4;

public class KonversiSuhu {
    float konversiSuhu(float t, char satuan){
        float hasil = 0;
        if (satuan == 'R' || satuan == 'r') {
            hasil = 4*t/5;
            return hasil;
        } else if (satuan == 'F' || satuan == 'f') {
            hasil = (9*t/5)+32;
            return hasil;
        } else if (satuan == 'K' || satuan == 'k') {
            hasil = t + (float) 273.15;
            return hasil;
        }else{
            return hasil;
        }
    }
}
