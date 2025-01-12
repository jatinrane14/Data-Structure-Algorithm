import java.util.Scanner;

public class InvertedNumRiPura {
    public static void pattern(int n){
        for(int i =0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j+" ");
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