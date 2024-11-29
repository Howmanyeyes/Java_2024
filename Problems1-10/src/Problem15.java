// File: src/Problem15.java

import helpful_classes.Problem15.Student;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Problem15 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Alice", "B22-205", 1, createGradesMap(4.0, 3.5, 2.5)));
        students.add(new Student("Bob", "B22-205", 2, createGradesMap(3.0, 2.8, 3.2)));
        students.add(new Student("Charlie", "B22-205", 1, createGradesMap(4.5, 4.2, 4.8)));
        students.add(new Student("Diana", "B22-215", 3, createGradesMap(2.9, 2.7, 3.1)));
        students.add(new Student("Ethan", "B22-215", 2, createGradesMap(3.5, 3.6, 3.7)));

        System.out.println("=== Initial Student List ===");
        printAllStudents(students);

        processStudents(students);

        System.out.println("\n=== Processed Student List ===");
        printAllStudents(students);

        int courseToPrint = 2;
        System.out.println("\n=== Students in Course " + courseToPrint + " ===");
        printStudents(students, courseToPrint);
    }

    private static Map<String, Double> createGradesMap(double grade1, double grade2, double grade3) {
        Map<String, Double> grades = new HashMap<>();
        grades.put("Mathematics", grade1);
        grades.put("Physics", grade2);
        grades.put("Chemistry", grade3);
        return grades;
    }

    private static void processStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            double average = student.calculateAverageGrade();
            if (average < 3.0) {
                System.out.println("Removing student: " + student.getName() + " (Average Grade: " + average + ")");
                iterator.remove();
            } else {
                int currentCourse = student.getCourse();
                student.setCourse(currentCourse + 1);
                System.out.println("Promoting student: " + student.getName() + " to course " + student.getCourse());
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        boolean found = false;
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No students found in course " + course + ".");
        }
    }

    private static void printAllStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
