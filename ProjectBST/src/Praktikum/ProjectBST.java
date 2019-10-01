package Praktikum;
import java.util.Scanner;
public class ProjectBST {
    
    static int pilihan = 0;
    
    
    public static void main(String[] args) {
        BinarySearchTree b =  new BinarySearchTree();
        menuHead();
        do {            
            menu();
            Scanner scInt = new Scanner(System.in);
        System.out.print(">> ");
        pilihan = scInt.nextInt();
        switch(pilihan){
            case 1:
                System.out.println("======================================");
                System.out.print("Masukkan data : ");
                int insertData = scInt.nextInt();
                b.insert(insertData);
                break;
            case 2:
                System.out.println("======================================");
                System.out.print("Masukkan data : ");
                int deleteData = scInt.nextInt();
                b.delete(deleteData);
                break;
            case 3:
                System.out.println("======================================");
                System.out.print("Masukkan data : ");
                int findData = scInt.nextInt();
                b.findNode(findData);
                break;
            case 4:
                System.out.println("======================================");
                System.out.println("Menampilkan data secara in order : ");
                b.display(b.root);
                System.out.println();
                break;
        }
        } while (pilihan!=5);
    }
    
    public static void menuHead(){
        System.out.println("======================================");
        System.out.println("BINARY SEARCH TREE");
    }
    
    public static void menu(){
        System.out.println("======================================");
        System.out.println("Pilih Menu : ");
        System.out.println("======================================");
        System.out.println("1. Insert");
        System.out.println("2. Delete");
        System.out.println("3. Find");
        System.out.println("4. Display");
        System.out.println("5. Keluar");
        System.out.println("======================================");
        
    }
}