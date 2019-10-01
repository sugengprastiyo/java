package Minggu6;
import java.util.Scanner;
public class BinarySearch {
    static void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for (int j=0; j<n-i-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    static int binarySearch(int arr[], int x){
        int awal = 0, akhir = arr.length -1;
        while (awal <= akhir){
            int tengah = awal + (akhir - awal)/2;
            
            if (arr[tengah] == x)
                return tengah;
            
            if (arr[tengah]< x)
                awal = tengah+1;
            
            else 
                akhir = tengah -1;
        }
        return -1;
    }
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Jumlah Data = ");
        int jumlahData = sc.nextInt();
        int arr[] = new int [jumlahData];
        for (int i = 0; i<jumlahData; i++){
            System.out.print("Data ke "+i+"= ");
            arr[i]=sc.nextInt();
        }
        
        System.out.print("Pencarian = ");
        int pencarian = sc.nextInt();
        
        
        int hasil;
        
        bubbleSort(arr);
        
        hasil = binarySearch(arr, pencarian);
        
        if (hasil == -1){
            System.out.println("Pencarian tidak ketemu");
        }else {
            System.out.println("Pencarian ketemu di index ke :" +hasil);
        }
    }
}
