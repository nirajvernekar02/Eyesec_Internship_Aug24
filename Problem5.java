import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount:\n");
        double principal = scanner.nextDouble();
        System.out.print("Enter the rate of interest\n");
        double rate = scanner.nextDouble();
        System.out.print("Enter the time (years)\n");
        double time = scanner.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple interest is " + simpleInterest);
    }
}
