import java.util.Scanner;

public class SumOfSeriesCubed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:\n");
        int n = scanner.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / Math.pow(i, 3);
        }
        System.out.println("Sum of the series 1/2^3 + 1/3^3 + … + 1/" + n + "^3 is: " + sum);
    }
}
