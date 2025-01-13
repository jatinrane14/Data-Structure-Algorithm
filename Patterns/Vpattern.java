public class Vpattern {
    public static void main(String args[]){
        int n =4;
        int val=0;
        for(int i =0;i<n;i++){
            for(int j =0;j<=i;j++){
                System.out.print(j+1);
                val =j+1;
            }
            for(int j =0;j<(n*2)-(i*2+1);j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){

                System.out.print(val);
                val-=1;
            }
            System.out.println("");
        }
    }
}
