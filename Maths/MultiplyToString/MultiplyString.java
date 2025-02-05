import java.math.BigInteger;

public class MultiplyString {
    static String multiplyTwoString(String s1, String s2){
        BigInteger number1 = new BigInteger(s1);
        BigInteger number2 = new BigInteger(s2);

        // Multiply the numbers
        BigInteger multi = number1.multiply(number2);
        String result  = multi.toString();
        return result;
    }
    public static void main(String[] args) {
        System.out.println(multiplyTwoString("342857466747623190253535915582654079729535249666495366204751947309612861759399743340838318159436477709808","4471335218251938463464417392810911901096513109096223883606949011331588570391782354624160500218170491853613331964401401436877119247304542334868677958787620083249"));
    }
}
