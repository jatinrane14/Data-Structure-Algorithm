import java.util.Arrays;
public class Solution {
    public static int[] plusOne(int digits[]){
        long sum=0;
        int count=0;
        for (int elem : digits) {
            sum = (sum*10)+elem;
        }
        sum=sum+1;
        int ld;
        long temp =sum;
        while (sum!=0) {
            ld = (int)sum%10;
            sum/=10;
            count++;
        }
        int result[] = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            ld = (int) (temp % 10);
            result[i] = ld;
            temp = temp / 10;
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]={9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
}