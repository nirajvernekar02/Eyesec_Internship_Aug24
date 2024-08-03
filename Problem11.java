import java.util.Scanner;

public class PositiveDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number num1:\n");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number num2:\n");
        int num2 = scanner.nextInt();
        int difference = Math.abs(num1 - num2);
        System.out.println("The result (difference) is: " + difference);
    }
}
