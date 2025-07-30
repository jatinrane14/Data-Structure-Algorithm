import java.util.Arrays;

public class FindNonRepeating {
    public static char findNonRepeating(String s){
        String sChar[] = s.split("");
        System.out.println(Arrays.toString(sChar));
        for (int i = 0; i < sChar.length; i++) {
            boolean flag = true;
            for(int j =0;j<sChar.length;j++){
                if(i!=j && sChar[i].equals(sChar[j])){
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return (char)sChar[i].charAt(0);
            }
        }
        return '$';
    }
    public static void main(String[] args) {
        System.out.println(findNonRepeating("helheoWorld"));
    }
}
