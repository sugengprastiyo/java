package Quis2;
public class BinaryTree {
    int[] data;
    int idxLast = -1, idxCur;

    public BinaryTree(int max) {
        data = new int[max];
    }

    void populateData(int data[], int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void add(int data) {
        idxLast++;
        this.data[idxLast] = data;
    }

    


    void getSibling(int data) {
        for (int i = 0; i < this.data.length; i++) {
            if (data == this.data[i]) {
                idxCur = i;
                break;
            }
        }
        if (idxCur == 0) {
            System.out.println("Data adalah root!");
        } else {
            int sibling = idxCur + 1;
            if (idxCur % 2 == 0)
                sibling = idxCur - 1;
            System.out.println("Sibling dari data : " + data + " adalah : " + this.data[sibling]);
        }
    }

    

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 2);
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            System.out.print(data[idxStart] + " ");
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }

    void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traversePostOrder(2 * idxStart + 1);
            traversePostOrder(2 * idxStart + 2);
            System.out.print(data[idxStart] + " ");
        }
    }
}