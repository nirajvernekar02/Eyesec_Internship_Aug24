import java.util.Scanner;

public class SportsClubRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name:\n");
        String name = scanner.nextLine();
        System.out.print("Enter the mobile number:\n");
        String mobileNumber = scanner.nextLine();
        System.out.print("Enter the age:\n");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Congratulations " + name + " for your successful registration.");
        } else {
            System.out.println("Sorry! You need to be at least 18 years old to get membership.");
        }
    }
}
