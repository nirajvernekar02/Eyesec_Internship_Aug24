import java.util.Scanner;
public class MatrixPattern31 {
    public static void main(String[] args) {
        int[][] matrix = {
            {19, 38, 57},
            {76, 95, 114},
            {133, 152, 171}
        };

        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
