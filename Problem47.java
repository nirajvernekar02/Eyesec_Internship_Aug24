import java.util.Scanner;

public class FactorialWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number:\n");
        int number = scanner.nextInt();
        int factorial = 1;

        while (number > 0) {
            factorial *= number;
            number--;
        }

        System.out.println("The factorial of the entered number is " + factorial);
    }
}
