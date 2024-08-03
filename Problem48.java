import java.util.Scanner;

public class Denominations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a four-digit number:\n");
        int number = scanner.nextInt();

        int thousands = number / 1000;
        number %= 1000;
        int hundreds = number / 100;
        number %= 100;
        int tens = number / 10;
        number %= 10;
        int ones = number;

        if (thousands > 0) System.out.println(thousands + "*1000 = " + (thousands * 1000));
        if (hundreds > 0) System.out.println(hundreds + "*100 = " + (hundreds * 100));
        if (tens > 0) System.out.println(tens + "*10 = " + (tens * 10));
        if (ones > 0) System.out.println(ones + "*1 = " + ones);
    }
}
