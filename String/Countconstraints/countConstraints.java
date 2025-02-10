public class countConstraints {
    public static void main(String[] args) {
        String str = "Hello World 123!";
        int charCount = str.length();
        int upperCase = 0;
        int lowerCase = 0;
        int digitCount = 0;
        int specialSymbol = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 65 && ch <= 90) {
                upperCase++;
            } else if (ch >= 97 && ch <= 122) {
                lowerCase++;
            } else if (ch >= 48 && ch <= 57) {
                digitCount++;
            } else {
                specialSymbol++;
            }
        }
        System.out.println("charCount : " + charCount);
        System.out.println("upperCase : " + upperCase);
        System.out.println("lowerCase : " + lowerCase);
        System.out.println("digitCount : " + digitCount);
        System.out.println("specialSymbol : " + specialSymbol);
    }
}