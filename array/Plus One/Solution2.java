import java.util.Arrays;
public class Solution2{
    public static int[] plusOne(int digits[]){
        int n = digits.length;
        for (int i =  digits.length-1; i >=0; i++) {
            if (digits[i]<9) {
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int newDigits[] = new int[n+1];
        newDigits[0] = 1;
        return newDigits;
    }
    public static void main(String[] args) {
        int arr[]={9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
}