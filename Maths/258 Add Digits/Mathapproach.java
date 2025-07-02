public class Mathapproach {
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