public class Solution {
    public static int addDigits(int num) {
        while (true) {
            int sum = 0;
            while (num > 0) {
                int ld = num % 10;
                sum += ld;
                num /= 10;
            }
            if (sum > 9) {
                num = sum;
            } else {
                return sum;
            }
        }
    }

    public static int addDigitsSol2(int num) {
        if (num==0) {
            return 0;
        }
        return num%9;
    }

    public static void main(String[] args) {
        System.out.println("result " + addDigitsSol2(38));
    }

}