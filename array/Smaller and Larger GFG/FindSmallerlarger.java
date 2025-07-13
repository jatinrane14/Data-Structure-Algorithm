//Q. Given a sorted array arr of non-repeating elements and a value target, return an array of size 2. The first value is the number of elements less than or equal to the target, and the second value is the number of elements greater than or equal to the target.

import java.util.Arrays;
public class FindSmallerlarger {
    public static int binarySearch(int arr[],int low,int high,int target){
        if(low > high){
            return 0;
        }
        int mid = (low + high)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid]<target){
            return binarySearch(arr,mid+1,high,target);
        }
        return binarySearch(arr,low,mid-1,target);
    }
    public static int[] findSolution(int arr[],int target){
        int n = arr.length;
        int index = binarySearch(arr,0,n-1,target);
        int greator = n-index;
        int smaller = (index!=0)?n-greator+1:0;
        return new int[]{smaller,greator};
    }
    public static void main(String[] args) {
        int arr[] ={1, 10,21, 8, 11, 12, 18, 19};
        int target = 12;
        System.out.println(Arrays.toString(findSolution(arr, target)));
    } 
}
