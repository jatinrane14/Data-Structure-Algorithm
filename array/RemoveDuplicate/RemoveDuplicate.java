import java.util.HashSet;
import java.util.Set;
public class RemoveDuplicate {
    static int removeDuplicate(int[] arr){
        Set<Integer> s = new HashSet<>();
        int index=0;
        
        for(int i=0;i<arr.length;i++){
            s.add(arr[i]);
        }

        for (int it : s) {
            arr[index] = it;
            index++;
        }
        return index;
    }
    public static void main(String args[]){
        int arr[]={1,2,2,3,4,4,5,6};
        
        System.out.println(removeDuplicate(arr));
    }
}
