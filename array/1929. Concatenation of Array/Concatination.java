// 1929. Concatenation of Array
// Given an integer array nums of length n, you want to create an array of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
// Specifically, ans is the concatenation of two nums arrays.

Return the array ans.
import java.util.Arrays;
public class Concatination {
    public static int[] getConcatinated(int arr[]){
        int concat[] = new int[arr.length*2];
        for(int i =0;i<arr.length;i++){
            concat[i] = arr[i];
            concat[i+arr.length] = arr[i];
        }
        return concat;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,6};
        System.out.println(Arrays.toString(getConcatinated(arr)));
    }
}