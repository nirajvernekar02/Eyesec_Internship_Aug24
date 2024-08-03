import java.util.Scanner;
public class SumOfSeriesWithFactorials {
    public static void main(String[] args) {
        int terms = 7;
        double sum = 0;

        for (int i = 1; i <= terms; i++) {
            double factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            sum += i / factorial;
        }

        System.out.println("Sum of the first 7 terms is: " + sum);
    }
}
