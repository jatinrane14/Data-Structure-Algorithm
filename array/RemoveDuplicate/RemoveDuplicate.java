import java.util.HashSet;
import java.util.Set;

/*
 * 1. Create a HashSet to store unique elements.
 * 2. Iterate through the array and add each element to the HashSet.
 * 3. After the loop, the HashSet will contain only unique elements.
 * 4. Create a new array of the same size as the HashSet.
 * 5. Iterate through the HashSet and copy each element to the new array.
 * 6. Return the new array.
 */
public class RemoveDuplicate {
    static int[] removeDuplicate(int[] arr){
        Set<Integer> s = new HashSet<>();
        int index=0;
        for(int i=0;i<arr.length;i++){
            s.add(arr[i]);
            arr[i] = 0;
        }
        for (int it : s) {
            arr[index] = it;
            index++;
        }
        return arr;
    }
    public static void main(String args[]){
        int arr[]={8,8,6,3,5,5,7,6,6};
        for (int i : removeDuplicate(arr)) {
            System.out.print(i+" ");
        }
    }
}
