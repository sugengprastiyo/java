package TUGAS5;
public class BinaryTreeTgs5 {
    NodeTgs5 root;
    public BinaryTreeTgs5(){
        root = null;
    }
    boolean isEmpty(){
        return root == null;
    }
    void add(int data){
        if(isEmpty()){
            root = new NodeTgs5 (data);
        }else{
            NodeTgs5 current = root;
            while(true){
                if(data<current.data){
                    if(current.left!=null){
                        current = current.left;
                    }else{
                        current.left = new NodeTgs5(data);
                        break;
                    }
                }else if (data>current.data){
                            if (current.right!=null){
                                current = current.right;
                            }else {
                                current.right = new NodeTgs5(data);
                                break;
                            }
                            }else{
                    break;
                }
                }
            }
        }
    void addRekursif(int data, NodeTgs5 current){
        if (isEmpty()) {//tree is empty
            root = new NodeTgs5(data);
        } else {             
            if (data<current.data) {
                if (current.left!=null) {
                    current = current.left;
                    addRekursif(data, current);
                } else {
                    current.left = new NodeTgs5(data);
                }
            } else if(data > current.data) {
                if (current.right!=null) {
                    current = current.right;
                    addRekursif(data, current);
                } else {
                    current.right = new NodeTgs5(data);
                }
            }else{//data is already exist;
                System.out.println("data is already exist");
            }
        }
}
    int findSmall(){
        NodeTgs5 current = root;
        while(current.left != null){
            current = current.left;
        }
        return current.data;
    }
    int findBig(){
        NodeTgs5 current = root;
        while (current.right != null){
            current = current.right;
        }
        return current.data;
    }
    boolean find(int data){
        boolean hasil = false;
        NodeTgs5 current = root;
        while(current!=null){
            if(current.data==data){
                hasil = true;
                break;
            }else if (data<current.data){
                current = current.left;
            }else{
                current = current.right;
            }
        }
        return hasil;
    }
    void tampilLeaf(NodeTgs5 root){
        if (root == null) {
            System.out.println("Leaf Kosong");
        }
        if (root.left==null && root.right==null) {
            System.out.print(root.data+ " ");
        } else {
            if (root.left!=null) {
                tampilLeaf(root.left);
            }
            if (root.right!=null) { 
                tampilLeaf(root.right);
            }
        }

    }
    int jumlahLeaf(NodeTgs5 root){
        if (root == null) {
            return 0;
        }
        if (root.left==null && root.right==null) {
            return 1;
        } else {
            return jumlahLeaf(root.left)+ jumlahLeaf(root.right); 
            }
    }
    
    void traversePreOrder(NodeTgs5 node){
        if (node != null){
            System.out.print(" "+node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    void traversePostOrder(NodeTgs5 node){
        if(node != null){
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" "+node.data);
        }
    }
    void traverseInOrder(NodeTgs5 node){
        if(node != null){
            traverseInOrder(node.left);
            System.out.print(" "+node.data);
            traverseInOrder(node.right);
        }
    }
    NodeTgs5 getSuccessor(NodeTgs5 del){
        NodeTgs5 successor = del.right;
        NodeTgs5 successorParent = del;
        while(successor.left!=null){
            successorParent = successor;
            successor = successor.left;
        }
        if(successor!=del.right){
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }
    
    void delete(int data){
        if (isEmpty()){
            System.out.println("Tree is empty");
            return;
        }
        NodeTgs5 parent = root;
        NodeTgs5 current = root;
        boolean isLeftChild = false;
        while (current!= null){
            if (current.data==data){
                break;
            }else if(data<current.data){
                parent = current;
                current = current.left;
                isLeftChild = true;
            }else if (data>current.data){
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if (current == null){
            System.out.println("Couldn't find data! ");
            return;
            
        }else{
            if(current.left==null&&current.right==null){
                if(current == root){
                    root = null;
                }else{
                    if(isLeftChild){
                        parent.left = null;
                    }else{
                        parent.right=null;
                    }
                }
            }else if (current.left==null){
                if(current==root){
                    root = current.right;
                }else{
                    if(isLeftChild){
                        parent.left = current.right;
                    }else{
                        parent.right = current.right;
                    }
                }
                }else if(current.right==null){
                        if(current==root){
                        root = current.left;
                        }else{
                        if(isLeftChild){
                        parent.left = current.left;
                        }else{
                        parent.right = current.left;
                        }
                        }
                }
                        else{
                        NodeTgs5 successor = getSuccessor(current);
                        if(current == root){
                        root = successor;
                        }else{
                        if (isLeftChild){
                        parent.left = successor;
                        }else{
                        parent.right = successor;
                        }
                        }
                        successor.left = current.left;
                        }
                        }
            }
        }
    
  
