import java.util.Scanner;
public class DiagonalMatrixPattern34 {
    public static void main(String[] args) {
        int[][] matrix = {
            {19, 0, 0},
            {0, 19, 0},
            {0, 0, 19}
        };

        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
