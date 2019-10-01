package Maxmin;
public class minMax {
    public int nilaiArray;
    
    public static void max_min(int[] arr, int indeks_awal, int indeks_akhir, Maxmin_hasil){
        int indeks_Tengah;
        Maxmin hasil1 = new Maxmin();
        Maxmin hasil2 = new Maxmin();
        
        if (indeks_awal == indeks_akhir){
            hasil.minimum = hasil.maximum = arr(indeks_awal);
        }else if (indeks_akhir - indeks_awal == 1){
            if (arr[indeks_awal] > arr[indeks_akhir]){
                    hasil.minimum = arr [indeks_akhir];
                    hasil.maximum = arr[indeks_awal];
            }else{
                hasil.minimum = arr[indeks_awal];
                hasil.maximum = arr[indeks_akhir];
            }
        }else{
            indeks_tengah = (indeks_awal + indeks akhir)/2;
            max_min(arr, indeks_awal, indeks_tengah, hasil1);
            max_min(arr, indeks_tengah + 1, indeks_akhir, hasil2);
            
            hasil.minimum = (hasil1.minimum < hasi.minimum) ? hasil.minimum : hasil2.minimum;
            hasil.maximum = (hasil1.maximum > hasil2.maximum) ? hasil1.maximum : hasil2.maximum;
        }
        int arr[] = new int [5];
        for (int = 0; i<5;i++){
        arr[i]=ppArray[i].nilaiArray;
    }
        Maxmin hasil = new Maxmin();
        max_min(arr, 0,4, hasil);
        System.out.println(" Divide Conquer ");
        System.out.print("Nilai Minimal : " + hasi.minimum + "\n Nilai Maksimal y : "+hasil.maximum);
    }
}
