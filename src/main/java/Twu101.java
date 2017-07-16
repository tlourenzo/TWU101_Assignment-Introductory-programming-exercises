/**
 * Created by tlourenzo on 16-07-2017.
 */
public class Twu101 {
    public static void main(String[] args) {

        final int n = 3;

        //easiestExerciseEver();
        //drawAHorizontalLine(n);
        //drawAVerticalLine(n);
        //drawARightRectangle(n);
        isoscelesTriangle();
        diamond();
        diamondWithName();
        fizzBuzz();

        PrimeFactors primeFactors = new PrimeFactors();
        primeFactors.generate(n);

    }


    /**
     *
     */
    private static void easiestExerciseEver() {
        System.out.println("*");
    }

    /**
     * @param n
     */
    private static void drawAHorizontalLine(int n) {
        if(n>0){
            System.out.print("*");
            drawAHorizontalLine(n-1);
        }
    }

    /**
     * @param n
     */
    private static void drawAVerticalLine(int n) {
        for (int i = 0; i <n ; i++) {
            System.out.println("*\n");
        }
    }

    /**
     * @param n
     */
    private static void drawARightRectangle(int n) {
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }

    /**
     *
     */
    private static void isoscelesTriangle() {

    }

    /**
     *
     */
    private static void diamond() {
    }

    /**
     *
     */
    private static void diamondWithName() {

    }

    /**
     *
     */
    private static void fizzBuzz() {

    }

}
