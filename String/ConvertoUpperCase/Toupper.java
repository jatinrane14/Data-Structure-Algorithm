public class Toupper {
    public static void main(String[] args) {
        String str = "This is a String";
        for(int i =0;i<str.length();i++){
            if(str.charAt(i) >=97 && str.charAt(i)<=122){
                System.out.print((char)(str.charAt(i)-32));
            }else{
                System.out.print(str.charAt(i));

            }
        }
    }
}