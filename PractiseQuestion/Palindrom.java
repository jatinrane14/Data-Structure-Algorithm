public class Palindrom {
    static boolean checkPalinndrome(int value){
        int rev=0,ld,temp=value;
        while (value>0) {
            ld = value%10;
            rev = (rev*10)+ld;
            value/=10;
        }
        if (temp==rev) {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(checkPalinndrome(121));
    }
}