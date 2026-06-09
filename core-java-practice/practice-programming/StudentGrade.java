import java.util.*;

public class StudentGrade {
    public static void main(String[] args) {
        double marks;
        String grade;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks: ");
        marks = scanner.nextDouble();

        if (marks >= 90) {
            grade = "A";
        } else if (marks >= 80) {
            grade = "B";
        } else if (marks >= 70) {
            grade = "C";
        } else if (marks >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Grade: " + grade);

        scanner.close();
    }
}