import java.util.Scanner;

public class BillingAmountWithDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the billing amount:\n");
        double amount = scanner.nextDouble();
        double discount;
        if (amount > 6000) {
            discount = amount * 0.10;
        } else {
            discount = 0;
        }
        double netAmount = amount - discount;
        System.out.println("Your net billing amount: " + netAmount);
    }
}
