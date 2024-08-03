import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the num1 value:\n");
        int num1 = scanner.nextInt();
        System.out.print("Enter the num2 value:\n");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
    }
}
