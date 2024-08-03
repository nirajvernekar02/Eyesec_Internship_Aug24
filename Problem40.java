import java.util.Scanner;
public class DecreasingPattern40 {
    public static void main(String[] args) {
        int[] lengths = {4, 3, 2, 1};
        int start = 1;

        for (int length : lengths) {
            for (int i = start; i < start + length; i++) {
                System.out.print(i + " ");
            }
            start += length;
            System.out.println();
        }
    }
}
