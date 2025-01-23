public class GoodPrime {
    static boolean checkPrime(long value){
        long sum=0,ld;
        while (value>0) {
            ld = value % 10;
            sum+=ld;
            value/=10;
        }
        for(int i =2;i<=sum/2;i++){
            if (sum%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // Good prime -> sum of digits of a given should be number is prime.
        System.out.println(checkPrime(23));
    }
}
