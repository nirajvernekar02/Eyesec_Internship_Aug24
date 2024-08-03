import java.util.Scanner;

public class PrimeNumbersBetweenBounds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lower bound value:\n");
        int lower = scanner.nextInt();
        System.out.print("Enter the upper bound value:\n");
        int upper = scanner.nextInt();
        System.out.print("The prime numbers between " + lower + " and " + upper + " are: ");
        for (int num = lower; num <= upper; num++) {
            boolean isPrime = num > 1;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
