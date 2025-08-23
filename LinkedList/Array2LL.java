class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
    Node(int data,Node ptr){
        this.data = data;
        this.next = ptr;
    }
}
public class Array2LL {
    static Node converArrToLL(int[] arr){
        if(arr.length==0){
            return null;
        }
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node newNode  = new Node(arr[i]);
            mover.next = newNode;
            mover = newNode;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {16,2,3,4,5};
        Node head = converArrToLL(arr);
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
