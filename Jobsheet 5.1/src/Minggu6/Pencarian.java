package Minggu6;
import java.util.Scanner;
public class Pencarian {
    Scanner sc = new Scanner (System.in);
   
    static int sequentialSearch(int arr[], int x){
        for (int i=arr.length-1; i>=0; i--){
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Data : 6,7,3,5,1,7,9,6,5,8");
        int arr[] = {6,7,3,5,1,7,9,6,5,8};
        for (int i = 0; i<arr.length; i++){
            
        }
        
        System.out.print("Masukkan data yang di cari =  ");
        int pencarian = sc.nextInt();
        
        int hasil;
        
        hasil = sequentialSearch(arr, pencarian);
        
        if (hasil == -1){
            System.out.println("Pencarian tidak ketemu");
        }else{
            System.out.println("Posisi terkanan bilangan "+pencarian+" berada pada index ke : "+hasil);
        }
    }
}
