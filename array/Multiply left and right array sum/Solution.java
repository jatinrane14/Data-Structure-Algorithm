// Q. You are given an array of integers, your task is to divide the array into two sub-arrays (left and right) containing half of the array elements. Find the sum of the subarrays and then return the multiply of both the subarrays.

// Note: If the length of the array is odd then the right half will contain one element more than the left half.

public class Solution {
    static int sumLRArrayMultiply(int arr[]){
        int mid = arr.length /2;
        int leftSum =0;
        int rightSum =0;
        for(int i =0;i<arr.length;i++){
            if(i<mid){
                leftSum+=arr[i];
            }
            else if(i>=mid){
                rightSum+=arr[i];
            }
        }
        return leftSum*rightSum;
    }
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4};
        System.out.println(sumLRArrayMultiply(arr));
        
    }
}
