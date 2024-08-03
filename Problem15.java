import java.util.Scanner;

public class GenerateNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of natural numbers to be generated:\n");
        int N = scanner.nextInt();
        System.out.print("First " + N + " natural numbers are: ");
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
