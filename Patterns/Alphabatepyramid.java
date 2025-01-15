public class Alphabatepyramid {
    static void pattern(int n){
        for(int i =0;i<n;i++){
            char c = 'A';
            for(int  j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i*2+1;j++){
                if(j== ((i*2+1)-1)){
                    System.out.print('A');
                }
                else{
                    System.out.print(c);
                } 
                c++;
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
}
