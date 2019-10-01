package TUGAS6;
public class BinaryTreeArray {
  int[] data;
    int idxLast;
    
    public void createArr(int size){
        data = new int[size];
    }
    
    void populateData(int idxLast){
        this.idxLast = idxLast;
    }
    
    void addData(int data[]){
        this.data = data;
    }
    
    void traverseInOrder(int idxStart){
        if (idxStart<=idxLast) {
            traverseInOrder(2*idxStart+1);
            System.out.print(data[idxStart]+" ");
            traverseInOrder(2*idxStart+2);
        }
    }
    
    void traversePreOrder(int idxStart){
        if (idxStart<=idxLast) {
            System.out.print(data[idxStart]+" ");
            traversePreOrder(2*idxStart+1);
            traversePreOrder(2*idxStart+2);
        }
    }
    
    void traversePostOrder(int idxStart){
        if (idxStart<=idxLast) {
            traversePostOrder(2*idxStart+1);
            traversePostOrder(2*idxStart+2);
            System.out.print(data[idxStart]+" ");
        }
    }
}

