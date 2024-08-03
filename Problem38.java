import java.util.Scanner;
public class MatrixOperations38 {
    public static void main(String[] args) {
        int[][] matrix = {
            {5, 6, 7},
            {4, 5, 6},
            {5, 6, 7}
        };

        int max = matrix[0][0];
        int min = matrix[0][0];
        int sum = 0;

        for (int[] row : matrix) {
            for (int value : row) {
                if (value > max) {
                    max = value;
                }
                if (value < min) {
                    min = value;
                }
                sum += value;
            }
        }

        System.out.println("Biggest element: " + max);
        System.out.println("Smallest element: " + min);
        System.out.println("Sum of elements: " + sum);
    }
}
