import java.util.Scanner;

public class BiggerOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number num1:\n");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number num2:\n");
        int num2 = scanner.nextInt();
        if (num1 > num2) {
            System.out.println("The bigger of the two numbers entered (" + num1 + " and " + num2 + ") is: " + num1);
        } else {
            System.out.println("The bigger of the two numbers entered (" + num1 + " and " + num2 + ") is: " + num2);
        }
    }
}
