package Minggu6;
import java.util.Scanner;
public class PencarianJumlah {

    public static void main(String[]args){
        int Jum =0;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Data : 6,7,3,5,1,7,9,6,5,8");
        int arr[] = {6,7,3,5,1,7,9,6,5,8};
        for (int i = 0; i<arr.length; i++){
            
        }
        
        System.out.print("Masukkan data yang di cari =  ");
        int pencarian = sc.nextInt();
        
        for (int i=0; i<arr.length; i++){
            if (arr[i] == pencarian){
                Jum++;
            }
        }
        
        if (Jum == 0){
            System.out.println("Pencarian tidak ketemu");
        }else{
            System.out.println("Posisi terkanan bilangan "+pencarian+" dalam array adalah : "+Jum);
        }
    }
}
 
