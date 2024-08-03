import java.util.Scanner;

public class BiggestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 1st number num1:\n");
        int num1 = scanner.nextInt();
        System.out.print("Enter the 2nd number num2:\n");
        int num2 = scanner.nextInt();
        System.out.print("Enter the 3rd number num3:\n");
        int num3 = scanner.nextInt();
        int biggest = Math.max(num1, Math.max(num2, num3));
        System.out.println("The biggest of the 3 numbers entered is: " + biggest);
    }
}
