import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Uniontwoarray {
    // Brute Force Approach
    public static int[] unionArray(int ar1[],int ar2[]){
        Set<Integer> st = new HashSet<>();
        for(int i =0;i<ar1.length;i++){
            st.add(ar1[i]);
        }
        for(int i =0;i<ar2.length;i++){
            st.add(ar2[i]);
        }
        int resA[] = new int[st.size()];
        int i =0;
        for (int elem : st) {
            resA[i] = elem;
            i++;
        }
        return resA;
    }
    public static void main(String[] args) {
        int arr1[]={1,2,2,3,4,6};
        int arr[] = {1,2,3,4,5,6,7};
        System.out.print(Arrays.toString(unionArray(arr1, arr)));
                
    }
}
