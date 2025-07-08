public class ReverseString{
    public static String reverse(String s){
        String newStr="";
        for(int i= s.length()-1;i>=0;i--){
            newStr+=s.charAt(i);
        }
        return newStr;
    }
    public static void main(String[] args) {
        System.out.println(reverse("Hello World!"));
    }
}
