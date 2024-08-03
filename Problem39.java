import java.util.Scanner;
public class RotatingMatrixPattern39 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4, 5},
            {5, 1, 2, 3, 4},
            {4, 5, 1, 2, 3},
            {3, 4, 5, 1, 2},
            {2, 3, 4, 5, 1}
        };

        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
