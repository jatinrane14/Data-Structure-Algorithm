public class Invertaphatri {
    static void pattern(int n){
        for(int i =0;i<n;i++){
            char ch = 'A';
            for(int j=0;j<n-i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println("");
        }
    }
    public static void main(String args[]){
        pattern(5);
    }
}
