import java.util.Arrays;

public class Leftshiftarray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5,6,7};
        int k=3;
        if(k>arr.length){
            k = k%arr.length;
        }
        int temp[] = new int[k];
        for(int i=0;i<k;i++){
            temp[i] = arr[i];
        }
        System.out.println("Temp: "+Arrays.toString(temp));
        for(int i = k;i<arr.length;i++){
            arr[i - k] = arr[i];
        }
        System.out.println("Only rotate: "+Arrays.toString(arr));
        int j=0;
        for(int i=arr.length-k;i<arr.length;i++){
            arr[i] = temp[j];
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
