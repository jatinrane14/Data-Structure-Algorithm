// Given the heads of two singly linked lists, head1 and head2, the task is to determine whether the two linked lists are identical. Two linked lists are considered identical if they have the same number of nodes and each corresponding node contains the same data in the same order. Return true if both lists are identical; otherwise, return false.
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Solution {
    static Node arr2LL(int[] arr){
        if (arr.length==0) {
            return null;
        }
        Node head  = new Node(arr[0]);
        Node traverse = head;
        for (int i = 1; i < arr.length; i++) {
            Node newNode  = new Node(arr[i]);
            traverse.next = newNode;
            traverse = newNode;
        }
        return head;
    }
    static boolean checkIdentical(Node head1, Node head2){
        Node temp1 = head1;
        Node temp2 = head2;

        while (temp1 != null && temp2 != null) {
            if (temp1.data != temp2.data) {
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return (temp1 == null && temp2 == null);
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,6};
        int arr2[] = {1,2,3,4,5,6};
        Node head1 = arr2LL(arr1);
        Node head2 = arr2LL(arr2);
        System.out.println("Is both Lists are identical?: "+ checkIdentical(head1, head2));
    }    
}
