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
    static int lengthOfLL(Node temp){
        Node temp1  = temp;
        int count =0;
        while(temp1 != null) {
            count ++;
            temp1 = temp1.next;
        }
        return count;
    }
    static void print(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    static Node deleteFromHead(Node head){
        if (head==null) {
            return head;
        }
        head = head.next;
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {16,2,3,4,5,6};
        Node head = converArrToLL(arr);
        print(head);
        head = deleteFromHead(head);
        print(head);
        System.out.print("Length of Liked List: "+lengthOfLL(head));
    }
}
