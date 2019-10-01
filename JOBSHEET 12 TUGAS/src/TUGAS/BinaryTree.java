package TUGAS;
public class BinaryTree {
    Node root;
    public BinaryTree(){
        root = null;
    }
    boolean isEmpty(){
        return root == null;
    }
    void add(int data){
        if(isEmpty()){
            root = new Node (data);
        }else{
            Node current = root;
            while(true){
                if(data<current.data){
                    if(current.left!=null){
                        current = current.left;
                    }else{
                        current.left = new Node(data);
                        break;
                    }
                }else if (data>current.data){
                            if (current.right!=null){
                                current = current.right;
                            }else {
                                current.right = new Node(data);
                                break;
                            }
                            }else{
                    break;
                }
                }
            }
        }
    void addRekursif(int data, Node current){
        if (isEmpty()) {//tree is empty
            root = new Node(data);
        } else {             
            if (data<current.data) {
                if (current.left!=null) {
                    current = current.left;
                    addRekursif(data, current);
                } else {
                    current.left = new Node(data);
                }
            } else if(data > current.data) {
                if (current.right!=null) {
                    current = current.right;
                    addRekursif(data, current);
                } else {
                    current.right = new Node(data);
                }
            }else{//data is already exist;
                System.out.println("data is already exist");
            }
        }
}
    int findSmall(){
        Node current = root;
        while(current.left != null){
            current = current.left;
        }
        return current.data;
    }
    int findBig(){
        Node current = root;
        while (current.right != null){
            current = current.right;
        }
        return current.data;
    }
    boolean find(int data){
        boolean hasil = false;
        Node current = root;
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
    void tampilLeaf(Node root){
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
    int jumlahLeaf(Node root){
        if (root == null) {
            return 0;
        }
        if (root.left==null && root.right==null) {
            return 1;
        } else {
            return jumlahLeaf(root.left)+ jumlahLeaf(root.right); 
            }
    }
    
    void traversePreOrder(Node node){
        if (node != null){
            System.out.print(" "+node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    void traversePostOrder(Node node){
        if(node != null){
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" "+node.data);
        }
    }
    void traverseInOrder(Node node){
        if(node != null){
            traverseInOrder(node.left);
            System.out.print(" "+node.data);
            traverseInOrder(node.right);
        }
    }
    Node getSuccessor(Node del){
        Node successor = del.right;
        Node successorParent = del;
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
        Node parent = root;
        Node current = root;
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
                        Node successor = getSuccessor(current);
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
    
  
