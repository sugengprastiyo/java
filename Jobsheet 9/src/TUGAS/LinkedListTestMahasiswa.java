package TUGAS;
import java.util.Scanner;
public class LinkedListTestMahasiswa {
    static Scanner scInt = new Scanner(System.in);
    static Scanner scString = new Scanner(System.in);
    public static void main(String []args){
        int pilihan = 0; 
        LinkedListMahasiswa data = new LinkedListMahasiswa();
        try{
            do {
                menuUtama();
                System.out.print("Masukkan pilihan : ");
                pilihan = scInt.nextInt();
                switch(pilihan){
                    case 1 : menuAdd();
                             int menu1=0;
                             System.out.print("Masukkan pilihan : ");
                             menu1 = scInt.nextInt();
                             switch(menu1){
                                 case 1 :  System.out.print("Masukkan nim : ");
                                           String nimAdd1 = scString.nextLine();
                                           System.out.print("Masukkan nama : ");
                                           String namaAdd1 = scString.nextLine();
                                           data.addFirst(nimAdd1, namaAdd1);
                                           data.print();
                                           break;
                                 case 2 :  System.out.print("Masukkan nim : ");
                                           String nimAdd2 = scString.nextLine();
                                           System.out.print("Masukkan nama : ");
                                           String namaAdd2 = scString.nextLine();
                                           System.out.print("Masukkan Index : ");
                                           int index2 = scInt.nextInt();
                                           data.add(nimAdd2, namaAdd2, index2);
                                           data.print();
                                           break;
                                 case 3 :  System.out.print("Masukkan nim yang dicari : ");
                                           String cariNimAdd = scString.nextLine();
                                           System.out.println("Masukkan data yang akan diinput : ");
                                           System.out.print("Masukkan nim : ");
                                           String nimAdd3 = scString.nextLine();
                                           System.out.print("Masukkan nama : ");
                                           String namaAdd3 = scString.nextLine();
                                           data.addKey(nimAdd3, namaAdd3, cariNimAdd);
                                           data.print();
                                           break;
                                 case 4 :  System.out.print("Masukkan nim : ");
                                           String nimAdd4 = scString.nextLine();
                                           System.out.print("Masukkan nama : ");
                                           String namaAdd4 = scString.nextLine();
                                           data.addLast(nimAdd4, namaAdd4);
                                           data.print();
                                           break;
                             }
                             break;
                    case 2 : menuRemove();
                             int menu2=0;
                             System.out.print("Masukkan pilihan : ");
                             menu2 = scInt.nextInt();
                             switch(menu2){
                                 case 1 :  System.out.print("Masukkan index : ");
                                           int index = scInt.nextInt();
                                           data.remove(index);
                                           data.print();
                                           break;
                                 case 2 :  System.out.println("Masukkan data yang akan di hapus : ");
                                           System.out.print("Masukkan nim : ");
                                           String nimHapus2 = scString.nextLine();
                                           data.removeKey(nimHapus2);
                                           data.print();
                                           break;
                                 case 3 :  data.clear();
                                           System.out.println("data LinkedList dihapus");
                                           break;
                             }
                             break;
                    case 3 : menuGet();
                             int menu3=0;
                             System.out.print("Masukkan pilihan : ");
                             menu3 = scInt.nextInt();
                             switch(menu3){
                                 case 1 :  System.out.print("Masukkan index : ");
                                           int index3 = scInt.nextInt();
                                           data.get(index3);
                                           break;
                                 case 2 :  System.out.println("Masukkan data yang akan di cari: ");
                                           System.out.print("Masukkan nim : ");
                                           String cariNim3 = scString.nextLine();
                                           data.getKey(cariNim3);
                                           break;
                             }
                             break;
                }
            } while (pilihan!=4);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    public static void menuUtama(){
        System.out.println("Pilih Menu : ");
        System.out.println("1. Tambah");
        System.out.println("2. Hapus");
        System.out.println("3. Cari");
        System.out.println("4. Keluar");
        
    }
    public static void menuAdd(){
        System.out.println("1. Tambah(First)");
        System.out.println("2. Tambah(Index)");
        System.out.println("3. Tambah (key) ");
        System.out.println("4. Tambah (last) ");
    }
    public static void menuRemove(){
        System.out.println("1. Hapus(Index)");
        System.out.println("2. Hapus (key) ");
        System.out.println("3. Clear ");
    }
    public static void menuGet(){
        System.out.println("1. Cari(Index)");
        System.out.println("2. Cari(key) ");
    }
}
