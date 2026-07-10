import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    double grade;

    Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }
}

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

    if (n <= 0) {
    System.out.println("No students available.");
    sc.close();
    return;
}

        // Input student details
        for (int i = 1; i <= n; i++) {
            System.out.println("\nStudent " + i);

            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter grade: ");
            double grade = sc.nextDouble();
            sc.nextLine(); // Consume newline

            students.add(new Student(name, grade));
        }

        // Calculate statistics
        double total = 0;
        double highest = students.get(0).grade;
        double lowest = students.get(0).grade;

        for (Student s : students) {
            total += s.grade;

            if (s.grade > highest) {
                highest = s.grade;
            }

            if (s.grade < lowest) {
                lowest = s.grade;
            }
        }

        double average = total / students.size();

        // Display summary report
        System.out.println("\n========== STUDENT GRADE REPORT ==========");
        System.out.printf("%-20s %-10s\n", "Student Name", "Grade");

        for (Student s : students) {
            System.out.printf("%-20s %-10.2f\n", s.name, s.grade);
        }

        System.out.println("------------------------------------------");
        System.out.printf("Average Score : %.2f\n", average);
        System.out.printf("Highest Score : %.2f\n", highest);
        System.out.printf("Lowest Score  : %.2f\n", lowest);

        sc.close();
    }
}