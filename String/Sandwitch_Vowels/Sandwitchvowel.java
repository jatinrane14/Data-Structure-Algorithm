public class Sandwitchvowel {
    public static String sandwitchString(String s){
        StringBuilder str = new  StringBuilder();
        for(int i=0;i<s.length();i++){
            if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u' ) {
                str.append(s.charAt(i));
            }
        }
        return  str.toString();
    }
    public static void main(String[] args) {
        System.out.println(sandwitchString("bab"));
    }
}
