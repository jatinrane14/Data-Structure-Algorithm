public class Gcdoftwonum {
    static long gcd(int a, int b){
        int result = Math.min(a, b);
        while(result>0){
            if(a%result == 0 && b%result == 0){
                return result;
            }
            result--;
        }
        return 1;
    }
    public static void main(String[] args) {
        int a = 20;
        int b =15;
        System.out.println(gcd(a, b));
    }
}
