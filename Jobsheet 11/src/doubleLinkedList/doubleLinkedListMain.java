package doubleLinkedList;
import java.util.Scanner;
public class doubleLinkedListMain {
    public static void main (String[] args) throws Exception{
        doubleLinkedList dll = new doubleLinkedList();
        Scanner scInt = new Scanner(System.in);
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
        System.out.println("9. Pencarian ASC");
        System.out.println("10. Pencarian Desc");
        System.out.println("11. Keluar ");
        System.out.println("=================================");
        System.out.print(">> ");
        pilihan = scInt.nextInt();
        switch(pilihan){
            case 1:
                System.out.println("=================================");
                System.out.print("Masukan data : ");
                int addFirst = scInt.nextInt();
                dll.addFirst(addFirst);
                System.out.println("");
                break;
            case 2:
                System.out.println("=================================");
                System.out.print("Masukan data : ");
                int addLast = scInt.nextInt();
                dll.addLast(addLast);
                System.out.println("");
                break;
            case 3:
                System.out.println("=================================");
                System.out.print("Masukan data : ");
                int add = scInt.nextInt();
                System.out.print("Masukan Posisi indeks data : ");
                int position = scInt.nextInt();
                dll.add(add, position);
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
                System.out.print("Masukkan data yang ingin dicari : ");
                int getIndex = scInt.nextInt();
                dll.getIndex(getIndex);
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
                break;
            }
        } while (pilihan!=11);
    }
}
