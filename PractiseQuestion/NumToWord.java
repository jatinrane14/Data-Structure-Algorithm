public class NumToWord {
    static String word(int n){
        switch(n){
            case 1: 
                return "One ";
            case 2:
                return "Two ";
            case 3:
                return "Three ";
            case 4:
                return "Four ";
            case 5:
                return "Five ";
            case 6:
                return "six ";
            case 7:
                return "Seven ";
            case 8:
                return "Eight ";
            case 9:
                return "Nine ";
            case 0:
                return "Zero ";
            default:
                return "Un ";
        }
    }
    static void convertToWord(int x){
        String wordStr = "";
        int ld,rev=0;
        while (x>0) {
            ld = x%10;
            rev = (rev*10)+ld;
            x/=10;
        }
        System.out.println(rev);
        int ld2;
        while (rev>0) {
            ld2 = rev%10;
            rev/=10;
            wordStr+=word(ld2);
        }
        System.out.println(wordStr);
    }
    public static void main(String[] args) {
        convertToWord(789);
    }
}