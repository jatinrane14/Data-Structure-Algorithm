public class Armstrng{
    public static void main(String args[]){
        int n = 153;
        int temp =n,count=0;
        while(temp>0){
            temp/=10;
            count++;
        }
        temp = n;
        int sum=0,ld;
        while(temp>0){
            ld = temp%10;
            sum+=Math.pow(ld,count);
            temp/=10;
        }
        if(sum == n){
           System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}