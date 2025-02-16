public class Sentencepalindrome {
    public static boolean isPalindrom(String s){
        String arr[] = new String[s.length()];
        arr = s.split(" ");
        System.out.println(arr);
        String newStr = "";
        for (String elem : arr) {
            newStr+=elem;
        }
        int low=0,high=newStr.length()-1;
        while (low<high) {
            if (newStr.charAt(low)!=newStr.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrom(""));
    }   
}