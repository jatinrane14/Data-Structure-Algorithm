import java.util.Arrays;

public class LargestElementBrute {
    public static void main(String[] args) {
        int a[] = {5,7,1,8,3,1,7};
        System.out.println("Largest Element is: "+largest(a));
    }
    static int largest(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}