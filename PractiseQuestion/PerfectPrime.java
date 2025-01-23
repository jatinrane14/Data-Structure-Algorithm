public class PerfectPrime {
    static boolean checkPrime(long x){
        for(int i =2;i<=x/2;i++){
            if (x%i==0) {
                return false;
            }
        }
        return true;
    }
    static boolean checkPerfectPrime(long value){
        long ld,sum=0;
        long temp = value;
        while(value>0){
            ld = value%10;
            sum+=ld;
            value/=10;
        }
        return (checkPrime(sum)&&checkPrime(temp));
    }
    public static void main(String[] args) {
        //Perfeect rime - > GIven number and the sum of digits in a number is prime
        // 11 -> prime  number , 1+1 =2 - >  prime  number
        System.out.println(checkPerfectPrime(11));
    }
}
