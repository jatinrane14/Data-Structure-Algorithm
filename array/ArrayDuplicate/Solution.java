import java.util.ArrayList;
import java.util.List;
public class Solution {
    public static List<Integer> dup(int arr[]){
        List ls = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    ls.add(arr[i]);
                    break;
                }
            }
        }
        return ls;
    }
    public static void main(String[] args) {
        int arr[] ={2,5,4,2,5};
        System.out.println(dup(arr));
    }
}
