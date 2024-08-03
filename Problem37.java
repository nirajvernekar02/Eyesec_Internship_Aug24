import java.util.Scanner;
public class ComplexPattern37 {
    public static void main(String[] args) {
        int n = 8;

        // Top border
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();

        // Middle part with vertical line
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n / 2; j++) {
                System.out.print(" ");
            }
            System.out.print("* ");
            for (int j = 0; j < n / 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        // Bottom border
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
