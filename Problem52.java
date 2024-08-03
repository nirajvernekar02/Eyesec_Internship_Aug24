import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 1st Operand num1:\n");
        int num1 = scanner.nextInt();
        System.out.print("Enter the 2nd Operand num2:\n");
        int num2 = scanner.nextInt();
        System.out.print("Enter the operator (1: add, 2: mul, 3: div, 4: mod):\n");
        int operator = scanner.nextInt();

        switch (operator) {
            case 1:
                System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
                break;
            case 2:
                System.out.println("The product of " + num1 + " and " + num2 + " is " + (num1 * num2));
                break;
            case 3:
                System.out.println("The division of " + num1 + " and " + num2 + " is " + (num1 / num2));
                break;
            case 4:
                System.out.println("The modulus of " + num1 + " and " + num2 + " is " + (num1 % num2));
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
    }
}
