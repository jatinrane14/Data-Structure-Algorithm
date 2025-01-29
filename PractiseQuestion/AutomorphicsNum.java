public class AutomorphicsNum {
    static boolean Automorphiccheck(int n){
        int ld,count=0,temp=n;
        while (temp>0) {
            ld = temp%10;
            temp/=10;
            count++;
        }
        int square = (int)Math.pow(n,2);
        int rem = (int)(square % Math.pow(10,count));
        if(rem == n){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println(Automorphiccheck(38));
    }
}