public class toLower {
    public static String toLower(String st){
        String newStr="";
        for(int i =0;i<st.length();i++){
            if (st.charAt(i)>=65 && st.charAt(i)<=90) {
                newStr+=(char)(st.charAt(i)+32);
            }
            else{
                newStr+=st.charAt(i);
            }
        }
        return newStr;
    }
    public static void main(String[] args) {
        System.out.println(toLower("HELLO BHAI"));
    }
}
