import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base number m:\n");
        int m = scanner.nextInt();
        System.out.print("Enter exponent number n:\n");
        int n = scanner.nextInt();

        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= m;
        }

        System.out.println(m + "^" + n + " = " + result);
    }
}
