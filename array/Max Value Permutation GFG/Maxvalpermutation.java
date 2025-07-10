// Given an array, arr of integers. Your task is to write a program to find the maximum value of ∑arr[i]*i, where i = 0, 1, 2,., n-1. You are allowed to rearrange the elements of the array.
// Note: Since the output could be large, print the answer modulo 109+7.
import java.util.Arrays;
public class Maxvalpermutation {
    static int maxValPermutation(int arr[]){
        Arrays.sort(arr);
        int MOD = 1000000007;
        long result = 0;
        for(int i=0;i<arr.length;i++){
            result = (result+(long)arr[i]*i) % MOD;
        }
        return (int)result;
    }
     public static void main(String[] args) {
        int arr[]={5, 3, 2, 4, 1};  
        System.out.println(maxValPermutation(arr));
    }
}