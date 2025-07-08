public class StringLower {
    public static String toLower(String st){
        StringBuilder newStr = new StringBuilder();
        for(int i =0;i<st.length();i++){
            if (st.charAt(i)>=65 && st.charAt(i)<=90) {
                newStr.append((char)(st.charAt(i)+32));
            }
            else{
                newStr.append(st.charAt(i));
            }
        }
        return newStr.toString();
    }
    public static void main(String[] args) {
        System.out.println(toLower("HELLO BHAI"));
    }
}
