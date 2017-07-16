
import java.util.ArrayList;

/**
 * Created by tlourenzo on 16-07-2017.
 */
public class PrimeFactors {
    /**
     * Method generate(int n) that given an integer N will return
     * a list of integers such that the numbers are the factors of N and are
     * arranged in increasing numerical order.
     * @param n
     */
    public void generate(int n) {
        System.out.println("//Initializing PrimeFactors generate method");
        ArrayList<Integer> primeFactors = new ArrayList();
        for (int factor = 2; factor <= n; factor++) {
            int exponent = 0;
            while (n % factor == 0) {
                n /= factor;
                exponent++;
            }
            if (exponent > 0) {
                primeFactors.add(factor);
            }
        }
        System.out.println(primeFactors.toString());
    }
}
