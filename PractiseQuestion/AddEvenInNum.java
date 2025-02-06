public class AddEvenInNum {

    static int sumDigitEven(int n){
        int ld, sum=0;
        while (n>0) {
            ld = n%10;
            if(ld%2==0){
                sum+=ld;
            }
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumDigitEven(232));
    }
}
