package tugas6;
import java.util.Scanner;
public class BinaryTreeMainTgs6 {
     static Scanner sc = new Scanner(System.in);
    static int pilihan = 0, panjangArr;
    static BinaryTreeArray bta = new BinaryTreeArray();
    static int arr[];
    
    public static void main(String[] args) {
        menuHead();
        arr = new int[bta.data.length];
        do {            
            menu();
            prosesMenu();
        } while (pilihan!=5);
    }
    public static void menu(){
        System.out.println("==================================");
        System.out.println("Pilih menu : ");
        System.out.println("==================================");
        System.out.println("1. Add ");
        System.out.println("2. Tampil Traverse InOrder");
        System.out.println("3. Tampil Traverse PreOrder");
        System.out.println("4. Tampil Traverse PostOrder");
        System.out.println("5. Keluar");
        System.out.println("==================================");
        System.out.print("MAsukkan pilihan : ");
        pilihan = sc.nextInt();
        System.out.println("==================================");
        
    }
    
    public static void prosesMenu(){
        switch(pilihan){
            case 1:
                for (int i = 0; i < bta.data.length; i++) {
                    System.out.print("Masukkan data ke-"+i+" : ");
                    arr[i] = sc.nextInt();
                    bta.addData(arr);
                }
                bta.populateData(bta.data.length-1);
                break;
            case 2:
                System.out.println("Tampil secara Traverse InOrder : ");
                bta.traverseInOrder(0);
                System.out.println("");
                break;
            case 3:
                System.out.println("Tampil secara Traverse PreOrder : ");
                bta.traversePreOrder(0);
                System.out.println("");
                break;
            case 4:
                System.out.println("Tampil secara Traverse PostOrder : ");
                bta.traversePostOrder(0);
                System.out.println("");
                break;
        }
    }
    
    public static void menuHead(){
        System.out.println("BINARY TREE ARRAY");
        System.out.println("==================================");
        System.out.print("Masukkan panjang array : ");
        panjangArr = sc.nextInt();
        bta.createArr(panjangArr);
    }
}
