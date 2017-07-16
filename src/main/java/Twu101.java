/**
 * Created by tlourenzo on 16-07-2017.
 */
public class Twu101 {

    private static final String NAME = "Tome Lourenco";

    public static void main(String[] args) {

        final int n = 3;
        final int factor = 30;

        easiestExerciseEver();
        drawAHorizontalLine(n);
        drawAVerticalLine(n);
        drawARightRectangle(n);
        isoscelesTriangle(n);
        diamond(n);
        diamondWithName(n);
        fizzBuzz();

        PrimeFactors primeFactors = new PrimeFactors();
        primeFactors.generate(factor);

    }


    /**
     * Print one asterisk to the console.
     */
    private static void easiestExerciseEver() {
        System.out.println("\n//Initializing easiestExerciseEver");
        System.out.println("*");
    }

    /**
     * Given a number n, print n asterisks on one line.
     * @param n
     */
    private static void drawAHorizontalLine(int n) {
        System.out.println("\n//Initializing drawAHorizontalLine");
        for (int i = 0; i <n ; i++) {
            System.out.print("*");
        }
    }

    /**
     * Given a number n, print n lines, each with one asterisks
     * @param n
     */
    private static void drawAVerticalLine(int n) {
        System.out.println("\n//Initializing drawAVerticalLine");
        for (int i = 0; i <n ; i++) {
            System.out.println("*");
        }
    }

    /**
     * Given a number n, print n lines,
     * each with one more asterisk than the last
     * (i.e. one on the first line, two on the second,etc.)
     * @param n
     */
    private static void drawARightRectangle(int n) {
        System.out.println("\n//Initializing drawARightRectangle");
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    /**
     *Given a number n, print a centered triangle.
     * @param n
     */
    private static void isoscelesTriangle(int n) {
        System.out.println("\n//Initializing isoscelesTriangle");
        for(int i=0;i<n;i++) {

            for(int j=0;j<=n-i;j++) {
                System.out.print(" ");
            }
            for(int k=0;k<=2*i;k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    /**
     *Given a number n, print a centered diamond.
     * @param n
     */
    private static void diamond(int n) {
        System.out.println("\n//Initializing diamond");
        int count=1;
        for(int i=1;i<=2*n-1;i++) {
            for(int j=count;j<=n;j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=count*2-1;k++) {
                System.out.print("*");
            }
            if(i<n)
                count++;
            else
                count--;
            System.out.println("");
        }
    }

    /**
     *Given a number n, print a centered diamond with your name in place of the middle line.
     * @param n
     */
    private static void diamondWithName(int n) {
        System.out.println("\n//Initializing diamondWithName");
        int count=1;
        for(int i=1;i<=2*n-1;i++) {
            for(int j=count;j<=n;j++) {
                System.out.print(" ");
            }
            if(i != n){
                for(int k=1;k<=count*2-1;k++) {
                    System.out.print("*");
                }
                if(i<n){
                    count++;
                }else{
                    count--;
                }

                System.out.println("");
            }else{
                System.out.println(NAME);
                count--;
            }
        }
    }

    /**
     * FizzBuzz is a simple number game where you count, but say "Fizz" and/or "Buzz"
     * instead of numbers adhering to certain rules.
     * Create a FizzBuzz() method that prints out the numbers 1 through 100.
     * Instead of numbers divisible by three print "Fizz".
     * Instead of numbers divisible by five print "Buzz".
     * Instead of numbers divisible by three and five print "FizzBuzz".
     */
    private static void fizzBuzz() {
        System.out.println("\n//Initializing fizzBuzz");
        for (int i = 1; i <= 100 ; i++) {

            if(i%3 ==0 && i%5 ==0){
                System.out.println("FizzBuzz");
                continue;
            }
            if(i%3==0){
                System.out.println("Fizz");
            }else if(i%5==0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }

}
