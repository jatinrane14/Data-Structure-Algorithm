import java.util.Scanner;

public class AlphabateleftTriangle {
    static void pattern(int n){
        for(int i =0;i<n;i++){
            char alpha = 65;
            for(int j =0;j<=i;j++){
                System.out.print(alpha);
                alpha++;
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n =  sc.nextInt();
        pattern(n);
        sc.close();
    }
}
