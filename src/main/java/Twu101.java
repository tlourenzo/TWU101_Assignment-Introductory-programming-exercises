/**
 * Created by tlourenzo on 16-07-2017.
 */
public class Twu101 {

    private static final String NAME = "Tome Lourenco";

    public static void main(String[] args) {

        final int n = 3;

        //easiestExerciseEver();
        //drawAHorizontalLine(n);
        //drawAVerticalLine(n);
        //drawARightRectangle(n);
        //isoscelesTriangle(n);
        //diamond(n);
        diamondWithName(n);
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
    private static void isoscelesTriangle(int n) {
        for(int i=0;i<n;i++) {

            for(int j=0;j<=n-i;j++) {
                System.out.print(" ");
            }
            for(int k=0;k<=2*i;k++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }

    /**
     *
     */
    private static void diamond(int n) {
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
     *
     */
    private static void diamondWithName(int n) {
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
     *
     */
    private static void fizzBuzz() {

    }

}
