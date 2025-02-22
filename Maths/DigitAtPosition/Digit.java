import java.util.Scanner;

public class Digit 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position you want: ");
        int pos = sc.nextInt();

        int n = 124520;
        int rev = 0;
        int count = 0, ld;
        while (n > 0) 
        {
            ld = n % 10;
            count++;
            rev = (rev * 10) + ld;
            n /= 10;
        }
        if (pos > count) 
        {
            System.out.println("Position is Invalid");
        } else 
        {
            int i = 1;
            while (i <= count) 
            {
                ld = rev % 10;
                rev /= 10;
                if (i == pos) 
                {
                    System.out.println("At position "+pos+" Number is: "+ld);
                    break;
                }
                i++;
            }
        }
        sc.close();
    }
}
