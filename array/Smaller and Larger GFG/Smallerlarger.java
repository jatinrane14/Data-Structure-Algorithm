//Q. Given a sorted array arr and a value target, return an array of size 2. The first value is the number of elements less than or equal to the target, and the second value is the number of elements greater than or equal to the target.

import java.util.Arrays;

public class Smallerlarger {
    public static int[] getMoreAndLess(int arr[],int target){
        int resultArr []={0,0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<=target) {
                resultArr[0]+=1;
            }
            if (arr[i]>=target) {
                resultArr[1]+=1;
            }
        }
        return resultArr;
    }
    public static void main(String[] args) {
        int arr[] ={1, 2, 8, 10, 11, 12, 19};
        int target = 0;
        System.out.println(Arrays.toString(getMoreAndLess(arr, target)));
    }
}
