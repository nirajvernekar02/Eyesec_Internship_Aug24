import java.util.Scanner;

public class SeriesAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:\n");
        int n = scanner.nextInt();
        int sum = 0;
        System.out.print("The series is: ");
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println();
        System.out.println("Sum of the numbers in the series is: " + sum);
    }
}
