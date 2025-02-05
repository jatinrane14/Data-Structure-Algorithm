import java.util.Arrays;

public class OptimalMoveatend {
    public static void main(String[] args) {
        int arr[] = {0,0,0,0,2,5,0};
        int j = -1;

        for(int i=0;i<arr.length;i++){
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        for(int i =j+1;i<arr.length;i++)  {
            if (j!=-1) {
                if(arr[i]!=0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j++;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
