package TUGAS;
public class BinaryTreeMain {
    public static void main (String[]args){
        BinaryTree bt = new BinaryTree();
        
        bt.addRekursif(6, bt.root);
        bt.addRekursif(4, bt.root);
        bt.addRekursif(8, bt.root);
        bt.addRekursif(3, bt.root);
        bt.addRekursif(5, bt.root);
        bt.addRekursif(7, bt.root);
        bt.addRekursif(9, bt.root);
        bt.addRekursif(10, bt.root);
        bt.addRekursif(15, bt.root);
        
        
       
        bt.traversePreOrder(bt.root);
        System.out.println("");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.println("Find "+bt.find(5));
        bt.delete(8);
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.println("Terbesar "+bt.findBig());
        System.out.println("Terkecil "+bt.findSmall());
        System.out.print("Leaf = ");
        bt.tampilLeaf(bt.root);
        System.out.println("Jumlah Leaf  = "+bt.jumlahLeaf(bt.root));
        
    }
}
