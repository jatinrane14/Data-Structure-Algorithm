public class PrintPrimeNum {
    static boolean checkPrime(int n){
        for(int i =2;i<=n/2;i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
        for(int i =1;i<=1000;i++){
            if (checkPrime(i)) {
                System.out.print(i+" ");
            }
        }
    }
}