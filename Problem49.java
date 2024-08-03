import java.util.Scanner;

public class IncrementDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a five-digit number:\n");
        String number = scanner.next();
        StringBuilder result = new StringBuilder();

        for (char ch : number.toCharArray()) {
            int digit = Character.getNumericValue(ch);
            digit = (digit + 1) % 10;
            result.append(digit);
        }

        System.out.println("Output: " + result.toString());
    }
}

