import java.util.Scanner;

public class Binarylefthalfpyramid {
    public static void pattern(int n){
        int val;
        for(int i =0;i<n;i++){
            if(i%2==0){
                val=1;
            } else{
                val =0;
            }
            for(int j=0;j<i+1;j++){
                System.out.print(val);
                if (val==1) {
                    val=0;
                }else{
                    val=1;
                }
            }
            System.out.println("");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of pyramid: ");
        int n = sc.nextInt();
        pattern(n);
        sc.close();
    }
}
