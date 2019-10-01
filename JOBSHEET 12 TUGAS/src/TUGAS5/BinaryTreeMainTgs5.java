package TUGAS5;
import java.util.Scanner;
public class BinaryTreeMainTgs5 {
    
    static Scanner scInt = new Scanner(System.in);
    static int pilihan = 0;
    static BinaryTreeTgs5 bt = new BinaryTreeTgs5();
   public static void main (String[]args){
        menuHead();
        do {            
          menu();
          prosesMenu();
        } while (pilihan!=7);
   }
    public static void menuHead(){
        System.out.println("==============================");
        System.out.println("BINARY TREE ");
    }

    
    public static void menu(){
        System.out.println("==============================");
        System.out.println("Pilih Menu: ");
        System.out.println("==============================");
        System.out.println("1. Add");
        System.out.println("2. Delete");
        System.out.println("3. Find");
        System.out.println("4. Traverse inOrder");
        System.out.println("5. Tracerse preOrader");
        System.out.println("6. Traverse postOrder");
        System.out.println("7. Keluar");
        System.out.println("==============================");
        System.out.print("Masukkan pilihan : ");
        pilihan = scInt.nextInt();
        System.out.println("==============================");
    }
    
    public static void prosesMenu(){
        switch(pilihan){
            case 1:
                System.out.print("Masukkan data : ");
                int addData = scInt.nextInt();
                bt.addRekursif(addData, bt.root);
                break;
            case 2:
                System.out.print("Masukkan data : ");
                int deleteData = scInt.nextInt();
                bt.delete(deleteData);
                System.out.println("Data : "+deleteData+" Berhasil dihapus");
                break;
            case 3:
                System.out.print("Masukkan data : ");
                int findData = scInt.nextInt();
                System.out.println(""+bt.find(findData));
                
                break;
            case 4:
                System.out.println("Tranverse inOrder: ");
                bt.traverseInOrder(bt.root);
                System.out.println("");
                break;
            case 5:
                System.out.println("traverse preOrder: ");
                bt.traversePreOrder(bt.root);
                System.out.println("");
                break;
            case 6:
                System.out.println("traverse postOrder: ");
                bt.traversePostOrder(bt.root);
                System.out.println("");
                break;
        
    }
}
}
