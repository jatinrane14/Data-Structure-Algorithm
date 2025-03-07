public class Solution {
    public static int count(int num){
        int ld;
        int count=0;
        while(num>0){
            ld = num %10;
            count++;
            num/=10;
        }
        // System.out.println(count);
        return count;
    }
    public static int revSum(int num,int digitCount){
        int ld;
        int rev=0;
        while(num>0){
            ld = num %10;
            rev = rev*10+ld;
            num/=10;
        }
        int sum=0,i=0;
        while(rev>0){
            ld = rev%10;
            sum+=ld;
            rev/=10;
            i++;    
            if(i==(int)(digitCount/2)){
                break;
            }
        }
        return sum;
    }
    public static int oriSum(int num,int digitCount){
        int ld, sum=0,i=0;
        while(num>0){
            ld = num%10;
            sum+=ld;
            num/=10;
            i++;
            if(i==(int)(digitCount/2)){
                break;
            }
        }
        return sum;
    }
    public static int countSymmetricIntegers(int low, int high) {
        int symmetricCount=0;
        for(int i = low;i<=high;i++){
            if(i<10){
                continue;
            }
            int digitCount = count(i);
            System.out.println(i);
            if(revSum(i,digitCount)==oriSum(i,digitCount)){
                symmetricCount++;
            }
        }
        return symmetricCount;
    }
    public static void main(String[] args) {
        System.out.println(countSymmetricIntegers(1200, 1230));
    }
}