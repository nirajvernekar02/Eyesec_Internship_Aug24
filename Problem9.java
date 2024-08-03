import java.util.Scanner;

public class EvenOrOddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:\n");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("The entered number " + num + " is even");
        } else {
            System.out.println("The entered number " + num + " is odd");
        }
    }
}
