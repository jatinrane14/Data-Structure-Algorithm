public class PerfectNumberGFG {
    static boolean isPerfectNumber(int n){
        long sum=1;
        long sqrt = (long)Math.sqrt(n);
        if(n<2){
            return false;
        }
        for(int i =2;i<n;i++){
            if(n%i==0){ 
                sum+=i;
            }
        }
        return sum==n;
    }
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
    }
}