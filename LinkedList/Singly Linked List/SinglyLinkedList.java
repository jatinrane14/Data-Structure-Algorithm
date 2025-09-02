class Node{
    int data;
    Node next;
    Node(int data){
        this.data  = data;
        this.next = null;
    }
}class LinkedList{
    private Node head = null;

    public void insertAtBeginning(int data){
        Node newNode  = new Node(data);
        newNode.next = head;
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
        Node newNode = new Node(data);
        if(head == null){
            if(position ==1){
                head = newNode;
                return;
            }
        }
        if(position==1){
            insertAtBeginning(data);
            return;
        }
        int count=0;
        Node temp =  head;
        while (temp != null) {
            count++;
            if(count == position-1){
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
    }
    void insertBeforeValue(int data,int value){
        if(head == null){
            return;
        }
        if(head.data == value){
            Node newNode =  new Node(data);
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data == value) {
                Node newNode =  new Node(data);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return;
    }
    void deleteHead(){
        if(head == null){
            return;
        }
        head = head.next;
    }
    void deleteTail(){
        Node temp = head;
        while (temp.next.next!=null) {
            temp = temp.next;
        }
        temp.next = null;
    }
    void deletePosition(int pos){
        int count =0;
        if (head == null) {
            return;
        }
        if (pos==1) {
            deleteHead();
        }
        Node temp = head;
        while (temp != null) {
            count++;
            if (count == pos-1) {
                Node temp2 = temp.next.next;
                temp.next = temp2;
                temp2 = null;
                return;
            }
            temp = temp.next;
        }
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
        list.insertAtTail(13); // 13
        list.insertAtTail(14); // 13->14
        list.insertAtPosition(12, 1); // 12->13->14
        list.insertBeforeValue(43, 14); // 12->13->43->14
        list.deleteHead(); // 13->43->14 
        list.deletePosition(3); // 13->43
        list.display();
    }
}
