import java.util.Scanner;

public class WeightCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the weight of the first person:\n");
        double weight1 = scanner.nextDouble();
        System.out.print("Enter the weight of the second person:\n");
        double weight2 = scanner.nextDouble();
        System.out.print("Enter the weight of the third person:\n");
        double weight3 = scanner.nextDouble();
        double totalWeight = weight1 + weight2 + weight3;
        double averageWeight = totalWeight / 3;
        System.out.println("The sum of weight of the 3 persons is " + totalWeight + " Kgs and the average weight is " + averageWeight + " Kgs");
    }
}
