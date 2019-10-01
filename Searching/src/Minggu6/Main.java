package Minggu6;
public class Main {
    static int sequentialSearch(int arr[], int x){
        for (int i =0; i< arr.length; i++){
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
    public static void main(String[]args){
        int[]data ={12, 5, 30, 25, 40, 7, 9};
        int cari =40;
        int hasil;
        
        hasil = sequentialSearch(data, cari);
        
        if (hasil == -1){
            System.out.println("Pencarian tidak ketemu");
        }else{
            System.out.println("Pencarian ketemu di index ke : "+hasil);
        }
    }
}
