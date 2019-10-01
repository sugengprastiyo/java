package Minggu6;
import java.util.Scanner;
public class Searching {
    static int sequentialSearch(int arr[], int x){
        for (int i =0; i< arr.length; i++){
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
    public static void main(String[]args){
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
        
        hasil = sequentialSearch(arr, pencarian);
        
        if (hasil == -1){
            System.out.println("Pencarian tidak ketemu");
        }else{
            System.out.println("Pencarian ketemu di index ke : "+hasil);
        }
    }
}
