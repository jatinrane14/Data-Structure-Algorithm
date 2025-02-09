import java.util.Arrays;
public class bubblesort {
    public static int[] sort(int arr[]){
        for(int i =0;i<arr.length-1;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {5,6,1,8,2,7};
        System.out.println(Arrays.toString(sort(arr)));
    }
}
