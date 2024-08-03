import java.util.Scanner;
public class SquarePattern36 {
    public static void main(String[] args) {
        int size = 4;

        // Top border
        for (int i = 0; i < size; i++) {
            System.out.print("@ ");
        }
        System.out.println();

        // Middle part with borders
        for (int i = 1; i < size - 1; i++) {
            System.out.print("@ ");
            for (int j = 1; j < size - 1; j++) {
                System.out.print("  ");
            }
            System.out.println("@");
        }

        // Bottom border
        for (int i = 0; i < size; i++) {
            System.out.print("@ ");
        }
        System.out.println();
    }
}
