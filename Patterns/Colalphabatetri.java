public class Colalphabatetri {
    static void pattern(int n){
        char c= 'A';
        for(int i=0;i<n;i++){
            for(int j =0;j<=i;j++){
                System.out.print(c);
            }
            c++;
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        pattern(6);
    }
}
