import java.util.Arrays;

public class ValidanIP {
    public static boolean checkValid(String s){
        // he "." is a regular expression metacharacter that matches any character, not a literal dot. So this splits your string into single characters.
        String parts[] = s.split("\\.");
        if(parts.length!=4){
            return false;
        }
        for (int i = 0; i < parts.length; i++) {
            try{
                if (parts[i].length() > 1 && parts[i].startsWith("0")) {
                    return false;
                }
                if(parts[i].isEmpty()){
                    return false;
                }
                if ((Integer.parseInt(parts[i])<0 || Integer.parseInt(parts[i])> 255)) {
                    return false;
                }
            }catch(NumberFormatException e){
                return false;
            }
        }
        System.out.println(Arrays.toString(parts));
        return true;
    }
    public static void main(String[] args) {
        System.out.println(checkValid("01.01.01.01"));
    }
}
