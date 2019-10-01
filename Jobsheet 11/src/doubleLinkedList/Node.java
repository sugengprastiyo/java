package doubleLinkedList;
public class Node {
    int data;
    Node prev, next;
    
    Node (Node prev, int data, Node next){
        this.prev=prev;
        this.data=data;
        this.next=next;
    }

    Node(Object object, String nm, int nl, Object object0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
