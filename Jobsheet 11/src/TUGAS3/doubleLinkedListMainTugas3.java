
package TUGAS3;
import java.util.Scanner;
public class doubleLinkedListMainTugas3 {
    public static void main (String[] args) throws Exception{
        doubleLinkedListTugas3 dll = new doubleLinkedListTugas3();
        Scanner scInt = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);
        int pilihan = 0;
        do {
        System.out.println("DOUBLE LINK LIST DENGAN MENU ");
        System.out.println("=================================");
        System.out.println("1. Tambah Awal");
        System.out.println("2. Tambah Akhir");
        System.out.println("3. Tambah Data Indeks Tertentu ");
        System.out.println("4. Hapus Awal ");
        System.out.println("5. Hapus Akhir ");
        System.out.println("6. Hapus Indeks Tertentu");
        System.out.println("7. Cetak Data");
        System.out.println("8. Cari");
        System.out.println("9. Urutkan Data secara Asc");
        System.out.println("10. Urutkan Data secara Desc");
        System.out.println("11. Keluar ");
        System.out.println("=================================");
        System.out.print(">> ");
        pilihan = scInt.nextInt();
        switch(pilihan){
            case 1:
                System.out.println("=================================");
                System.out.print("Masukan nama : ");
                String addFirstNama = scString.nextLine();
                System.out.print("Masukan nilai : ");
                int addFirstNilai = scInt.nextInt();
                dll.addFirst(addFirstNama,addFirstNilai);
                System.out.println("");
                break;
            case 2:
                System.out.println("=================================");
                System.out.print("Masukan nama : ");
                String addLastNama = scString.nextLine();
                System.out.print("Masukan nilai : ");
                int addLastNilai = scInt.nextInt();
                dll.addLast(addLastNama,addLastNilai);
                System.out.println("");
                break;
            case 3:
                System.out.println("=================================");
                System.out.print("Masukan nama : ");
                String addNama = scString.nextLine();
                System.out.print("Masukan nilai : ");
                int addNilai = scInt.nextInt();
                System.out.print("Masukkan indek : ");
                int position =  scInt.nextInt();
                dll.add(addNama,addNilai,position);
                System.out.println("");
                break;
            case 4:
                System.out.println("=================================");
                dll.removeFirst();
                System.out.println("");
                break;
            case 5:
                System.out.println("=================================");
                dll.removeLast();
                System.out.println("");
                break;
            case 6:
                System.out.println("=================================");
                System.out.print("Masukkan indeks : ");
                int removeByIndex = scInt.nextInt();
                dll.remove(removeByIndex);
                System.out.println("");
                break;
            case 7:
                System.out.println("=================================");
                dll.print();
                System.out.println("");
                break;
            case 8:
                System.out.println("=================================");
                System.out.print("Masukkan nama yang ingin dicari : ");
                String getNama = scString.nextLine();
                dll.getIndex(getNama);
                System.out.println("");
                break;
            case 9:
                System.out.println("=================================");
                System.out.println("Hasil pengurutan Ascending");
                dll.bubbleSortAsc();
                dll.print();
                System.out.println("");
                break;
            case 10:
                System.out.println("=================================");
                System.out.println("Hasil pengurutan Descending");
                dll.bubbleSortDesc();
                dll.print();
                System.out.println("");
            }
        } while (pilihan!=11);
    }
}