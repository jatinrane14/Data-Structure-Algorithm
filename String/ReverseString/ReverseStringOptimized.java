public class ReverseStringOptimized {
    public static String reverse(String s){
        StringBuilder revStr = new StringBuilder();
        for(int i =s.length()-1;i>=0;i--){
            revStr.append(s.charAt(i));
        }
        return revStr.toString();
    }
    public static void main(String args[]){
        System.out.println(reverse("jatin"));
    }
}