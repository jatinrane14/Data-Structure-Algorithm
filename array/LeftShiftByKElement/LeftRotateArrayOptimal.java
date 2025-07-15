import java.util.Arrays;
import java.util.Collections;
public class LeftRotateArrayOptimal {
    public static void Reverse(int[] arr, int start, int end) {
    while (start <= end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }
    public static void leftRotate(int arr[],int k){
        Reverse(arr,0,k-1);
        Reverse(arr,k,arr.length-1);
        Reverse(arr,0,arr.length-1);
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8};
        int k = 3;
        leftRotate(arr,k);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            
        }
        
    }
}
