import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();

        System.out.print("Enter the Number of Students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter Details for Student " + (i + 1));

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Marks: ");
            int marks = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            studentList.add(new Student(name, marks));
        }

        int totalMarks = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        String topStudent = "";
        String lowStudent = "";

        for (Student s : studentList) {
            totalMarks += s.marks;

            if (s.marks > highest) {
                highest = s.marks;
                topStudent = s.name;
            }

            if (s.marks < lowest) {
                lowest = s.marks;
                lowStudent = s.name;
            }
        }

        double average = (double) totalMarks / studentList.size();

        System.out.println("\n======================== STUDENT SUMMARY REPORT ==================");
        for (Student s : studentList) {
            System.out.println("Name: " + s.name + " | Marks: " + s.marks);
        }

        System.out.println("\nAverage Marks: " + average);
        System.out.println("Highest Marks: " + highest + " (by " + topStudent + ")");
        System.out.println("Lowest Marks: " + lowest + " (by " + lowStudent + ")");
    }
}
