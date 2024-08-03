import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the upper bound number to generate the Fibonacci numbers:\n");
        int upperBound = scanner.nextInt();
        int a = 0, b = 1;
        System.out.print("Fibonacci series up to the entered number is: ");
        while (a <= upperBound) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
