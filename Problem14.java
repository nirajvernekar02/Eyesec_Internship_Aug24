import java.util.Scanner;

public class MarksAndGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the marks scored in 1st subject:\n");
        int mark1 = scanner.nextInt();
        System.out.print("Enter the marks scored in 2nd subject:\n");
        int mark2 = scanner.nextInt();
        System.out.print("Enter the marks scored in 3rd subject:\n");
        int mark3 = scanner.nextInt();
        int totalMarks = mark1 + mark2 + mark3;
        double average = totalMarks / 3.0;
        char grade;
        if (average < 35) {
            grade = 'C';
        } else if (average < 60) {
            grade = 'B';
        } else {
            grade = 'A';
        }
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Average is: " + average);
        System.out.println("Grade: " + grade);
    }
}
