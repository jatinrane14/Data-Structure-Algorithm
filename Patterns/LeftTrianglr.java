import java.util.Scanner;

public class LeftTrianglr {
    static void pattern(int n){
        int val =1;
        for(int i =0;i<n;i++){
            for(int j =0;j<i+1;j++){
                System.out.print(val+" ");
                val++;
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
