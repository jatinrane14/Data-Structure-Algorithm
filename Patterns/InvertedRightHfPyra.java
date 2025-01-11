import java.util.Scanner;

public class InvertedRightHfPyra {
    public static void pattern(int n){
        for(int i =0;i<n;i++){
            for(int j=n-i-1;j>=0;j--){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of pyramid: ");
        int n = sc.nextInt();
        pattern(n);
        sc.close();
    }
}
