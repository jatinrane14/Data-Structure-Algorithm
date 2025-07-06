import java.util.Arrays;
public class SecondLargestbrute {
    public static int secondLargest(int arr[]){
        int n  = arr.length;
        if(n<2){
            return -1;
        }
        Arrays.sort(arr);
        for (int i = n-2; i>=0; i--) {
            if (arr[i]!=arr[n-1]) {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1, 7, 7, 7, 6, 7,7};
        System.out.println(secondLargest(arr));
    }
}
