import java.util.Scanner;
public class FillScreen {
    public static void main(String[] args) {
        // Assuming terminal width and height are known
        int width = 80;
        int height = 24;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
