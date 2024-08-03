import java.util.Scanner;
public class DiamondPattern35 {
    public static void main(String[] args) {
        int n = 8;

        // Top half
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        // Bottom half
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();

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

        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
