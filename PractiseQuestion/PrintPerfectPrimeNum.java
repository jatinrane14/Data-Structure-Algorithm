public class PrintPerfectPrimeNum {
    static boolean checkPrime(int n){
        for (int j = 2;j<=n/2; j++) {
            if(n%j==0){
                return false;
            }
        }
        return true;
    }
    static boolean checkPerPrime(int n){
        int ld,sum=0,temp=n;
        for(int i =2;i<=n;i++){
            while(n>0) {
                ld = n%10;
                sum+=ld;
                n/=10;
            }
        }        
        if(checkPrime(sum)&&checkPrime(temp)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        
        for(int i=2;i<=6000;i++){
            if (checkPerPrime(i)) {
                System.out.print(i+" ");
            }
        }
    }
}
