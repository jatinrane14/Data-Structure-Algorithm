import java.util.Scanner;

public class InvertedPyramid{
    static void pattern(int n){
        for(int i =0;i<n;i++){
            for( int j =0;j<i;j++){    
                System.out.print("  ");
            }
            for(int j =0;j<(n*2)-(i*2+1);j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of pyramid: ");
        int n = sc.nextInt();
        pattern(n);
        sc.close();
    }
}