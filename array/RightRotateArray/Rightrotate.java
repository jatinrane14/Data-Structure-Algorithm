import java.util.Arrays;

public class Rightrotate {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int temp = arr[arr.length-1];for(
        int i = arr.length-2;i>=0;i--){
            arr[i + 1] = arr[i];
        }
        arr[0]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
