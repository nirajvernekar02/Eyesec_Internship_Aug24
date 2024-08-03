import java.util.Scanner;

public class NaturalNumbersDescending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of natural numbers to be generated:\n");
        int N = scanner.nextInt();
        System.out.print("The first " + N + " natural numbers in descending order are: ");
        for (int i = N; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
