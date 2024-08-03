import java.util.Scanner;

public class DiscountBasedOnMembership {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the bill amount:\n");
        double billAmount = scanner.nextDouble();
        System.out.print("Do you have a membership card? (Y/N)\n");
        char hasCard = scanner.next().charAt(0);
        double discount;
        if (hasCard == 'Y' || hasCard == 'y') {
            discount = billAmount * 0.10;
        } else {
            discount = billAmount * 0.03;
        }
        double netAmount = billAmount - discount;
        System.out.println("Thank you! Your total bill amount is Rs " + billAmount + ", discount is Rs " + discount + " and net amount payable is Rs " + netAmount + ".");
    }
}
