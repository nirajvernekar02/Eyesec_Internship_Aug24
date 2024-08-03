import java.util.Scanner;

public class CountPrimeDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number:\n");
        int number = scanner.nextInt();
        int count = 0;

        while (number != 0) {
            int digit = number % 10;
            if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
                count++;
            }
            number /= 10;
        }

        System.out.println("Number of prime digits in the entered number is " + count);
    }
}
