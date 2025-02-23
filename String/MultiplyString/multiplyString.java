import java.util.Arrays;
public class multiplyString {
    static String multiplyStrings(String num1, String num2){
        long a = Long.parseLong(num1);
        long b = Long.parseLong(num2);
        String result = Long.toString(a*b);
        return result;
    }
    public static void main(String[] args) {
        System.out.println(multiplyStrings("2","3" ));
    }
}