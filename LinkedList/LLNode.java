class Node{
    int data;
    Node next;
    Node(int data1){
        this.data = data1;
        this.next = null;
    }
    Node(int data,Node ptr){
        this.data = data;
        this.next = ptr;
    }
}
public class LLNode {
    public static void main(String[] args) {
        Node newNode  = new Node(2);
        System.out.print(newNode.data);
    }
}
