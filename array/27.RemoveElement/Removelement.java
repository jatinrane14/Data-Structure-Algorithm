import java.util.Arrays;

public class Removelement {
    public static void removeElement(int arr[],int num){
        int k=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=num) {
                arr[k++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[]={1,3,6,8,2,7,2,4};
        removeElement(arr, 2);
    }
}
