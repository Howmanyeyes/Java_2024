import java.util.Scanner;

import helpful_classes.Problem9.PostGraduateStudent;
import helpful_classes.Problem9.Student;

public class Problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Scholarship Calculator ===\n");

        // Input for the first student
        System.out.println("Enter details for the first student:");
        System.out.print("First Name: ");
        String firstName1 = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName1 = scanner.nextLine();
        System.out.print("Average Grade: ");
        double averageGrade1 = getValidGrade(scanner);

        Student student1 = new Student(firstName1, lastName1, averageGrade1);

        // Input for the second postgraduate student
        System.out.println("\nEnter details for the postgraduate student:");
        System.out.print("First Name: ");
        String firstName2 = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName2 = scanner.nextLine();
        System.out.print("Average Grade: ");
        double averageGrade2 = getValidGrade(scanner);

        PostGraduateStudent postGradStudent = new PostGraduateStudent(firstName2, lastName2, averageGrade2);

        // Display scholarship amounts
        System.out.println("\n--- Scholarship Details ---");
        System.out.println(student1.getFirstName() + " " + student1.getLastName() + " has a scholarship of: " + student1.getScholarship());
        System.out.println(postGradStudent.getFirstName() + " " + postGradStudent.getLastName() + " has a scholarship of: " + postGradStudent.getScholarship());

        scanner.close();
    }

    private static double getValidGrade(Scanner scanner) {
        double grade = -1.0;
        while (true) {
            try {
                grade = Double.parseDouble(scanner.nextLine());
                if (grade < 0.0 || grade > 5.0) {
                    System.out.print("Please enter a valid average grade (0.0 - 5.0): ");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a numerical average grade: ");
            }
        }
        return grade;
    }
}
