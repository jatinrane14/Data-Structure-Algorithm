import java.util.Scanner;

public class Halfpyramid {
    public static void pattern(int n){
        for(int i =0;i<n-1;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i =0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
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
