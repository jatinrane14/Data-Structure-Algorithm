class Base1{
    int n;
    Base1(int num){
        n = num;
    }
}
class Factorial extends Base1{
    Factorial(int n){
        super(n);
    }
    
    public void factorial(){
        int res=1;
        for (int i = 1; i <= n; i++) {
            res*=i;
        }
        System.out.println("Factorial of "+n+" is: "+res);
    }
}
class Prime extends Base1{
    Prime(int n){
        super(n);
    }
    
    public void isPrime(){
        for (int j = 2; j < n/2; j++){
            if (n%j==0) {
                System.out.println("Not Prime");
            }
        }
        System.out.println("Prime");
    }
}
class Reverse extends Base1{
    Reverse(int n){
        super(n);
    }
    
    public void reverse(){
        int temp = n,ld,rev=0;
        while (temp>0) {
            ld = temp%10;
            rev = rev *10+ld;
            temp/=10;
        }
        System.out.println("Reverse: "+rev);
    }
}
public class MathFun {
    public static void main(String[] args) {
        Reverse rev = new Reverse(647);
        rev.reverse();

        Prime p = new Prime(21);
        p.isPrime();

        Factorial f = new Factorial(21);
        f.factorial();
    }
}
