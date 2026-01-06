import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Marks (0-100): ");
        int marks = scanner.nextInt();

        char grade;

        if (marks >= 75) {
            grade = 'A';
        } else if (marks >= 60) {
            grade = 'B';
        } else if (marks >= 40) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        System.out.println("\nStudent Result");
        System.out.println("Name  : " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade : " + grade);

        scanner.close();
    }
}
