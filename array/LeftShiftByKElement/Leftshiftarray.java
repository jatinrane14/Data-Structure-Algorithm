import java.util.Arrays;

public class Leftshiftarray {
    static int[] shifting(int arr[],int k){
        int n = arr.length;
        if(k==n){
            return arr;
        }
        if(k>n){
            k = k%n;
        }
        // Store in temp array
        int temp[] = new int[k];
        for(int i =0;i<k;i++){
            temp[i] = arr[i];
        }
        
        // shfting
        for(int i = k;i<n;i++){
            arr[i-k] = arr[i];
        }

        // Place temp array elem at last in array
        int j =0;
        for(int i = n-k; i<n;i++){
            arr[i] = temp[j];
            j++;
        }

        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int k = 9;
        System.out.println(Arrays.toString(shifting(arr,k)));
        
    }
}
