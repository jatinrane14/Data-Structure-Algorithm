import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PrimeNumbers {
    public static boolean isPrime(int n){
        for (int i = 2; i<=n/2; i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        File f = new File("Primenumlist.txt");
        try{
            f.delete();
            f.createNewFile();
            FileWriter fw = new FileWriter(f,true);
            for(int j =1;j<=30;j++){
                if (isPrime(j)) {
                    fw.write(String.valueOf(j)+" ");
                }
            }
            fw.close();
        } catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }
    }
}