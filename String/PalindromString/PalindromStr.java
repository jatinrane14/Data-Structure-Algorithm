public class PalindromStr {
    public static boolean isPlaindrom(String s){
        String newStr = "";
        for(int i = s.length()-1;i>=0;i--){
            newStr+=s.charAt(i);
        }
        for(int i =0;i<s.length();i++){
            if(s.equals(newStr)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPlaindrom("jatin"));

    }
}
