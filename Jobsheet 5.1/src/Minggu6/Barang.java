package Minggu6;
import java.util.Scanner;
public class Barang {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);
        System.out.println("Masukkan jumlah barang = ");
        int barang = sc.nextInt();
        int urut[] = new int [barang];
        String nama[] = new String [barang];
        int stok[] = new int [barang];
        int harga[] = new int [barang];
        for (int i = 0; i < barang;i++){
            System.out.print("Masukkan Nomor Urut Barang = ");
            urut[i] = sc.nextInt();
            System.out.print("Masukkan Nama Barang = ");
            nama[i] = scString.nextLine();
            System.out.print("Masukkan Stok Barang = ");
            stok[i] = sc.nextInt();
            System.out.print("Masukkan Harga Barang = ");
            harga[i] = sc.nextInt();
            System.out.println(" ");
        }
        bubbleSort(urut);
        for (int i = 0; i<barang; i++){
            System.out.println("No urut barang = "+urut[i]);
            System.out.println("Nama Barang = "+nama[i]);
            System.out.println("Stok Barang = "+stok[i]);
            System.out.println("Harga Barang = "+harga[i]);
            System.out.println(" ");
        }
        System.out.println(" Masukkan Nomor Urut Barang = ");
        int pencarian = sc.nextInt();
        int hasil = binarySearch(urut, pencarian);
        if (hasil == -1){
            System.out.println("Pencarian tidak ketemu");
        }else {
            System.out.println("No urut barang = "+urut[hasil]);
            System.out.println("Nama Barang = "+nama[hasil]);
            System.out.println("Stok Barang = "+stok[hasil]);
            System.out.println("Harga Barang = "+harga[hasil]);
    }
    }
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
}

