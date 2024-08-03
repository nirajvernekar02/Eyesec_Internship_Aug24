import java.util.Scanner;

public class ConvertNegativeToPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:\n");
        int num = scanner.nextInt();
        if (num < 0) {
            num = -num;
        }
        System.out.println("The result is: " + num);
    }
}
