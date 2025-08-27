class Node{
    int data;
    Node next;
    Node(int data){
        this.data  = data;
        this.next = null;
    }
}class LinkedList{
    private Node head = null;
    private Node tail = null;

    public void insertAtBeginning(int data){
        Node newNode  = new Node(data);
        head = newNode;
    } 
    public void insertAtTail(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void insertAtPosition(int data, int position){
        
    }
    public void display(){
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
public class SinglyLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtTail(13);
        list.insertAtTail(14);
        list.display();
    }
}
