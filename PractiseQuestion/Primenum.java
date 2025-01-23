public class Primenum {
    static boolean checkPrime(int value){
        // Brute Method
        /*
        int count =0;
        for(int i =1;i<=value;i++){
            if(value%i==0){
                count++;
            }
        }
        if (count==2) {
            return true;
        } else{
            return false;
        }
        */
        
        // 
        boolean flag = false;
        for(int i =2;i<=value/2;i++){
            if (value%i==0) {
                flag = true;
            }
        }
        if (flag) {
            return false;
        } else{
            return true;
        }
    }
    public static void main(String[] args) {
        System.out.println(checkPrime(15));
    }
}