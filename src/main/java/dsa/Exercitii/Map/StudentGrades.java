package dsa.Exercitii.Map;

import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SortedMap<String, Integer> studentCatalog = new TreeMap<>();

        while (true) {
            System.out.println("Student Grades Management System:");
            System.out.println("1. Add Student Grade");
            System.out.println("2. Remove Student Grade");
            System.out.println("3. Update Student Grade");
            System.out.println("4. Display all student and grades");
            System.out.println("5. Exit system");
            System.out.println("\nEnter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Enter student grade: ");
                    int studentGrade = scanner.nextInt();
                    studentCatalog.put(studentName, studentGrade);
                    System.out.println("Grade added successfully");
                    break;
                case 2:
                    System.out.print("Enter student name to remove: ");
                    studentName = scanner.nextLine();
                    if(studentCatalog.containsKey(studentName)){
                        studentCatalog.remove(studentName);
                        System.out.println("Student was removed from catalog!");
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;
                case 3:
                    System.out.print("Enter student name to update: ");
                    studentName = scanner.nextLine();
                    if(studentCatalog.containsKey(studentName)){
                        System.out.println("Enter new grade: ");
                        studentGrade = scanner.nextInt();
                        studentCatalog.put(studentName, studentGrade);
                        System.out.println("Student was updated successfully!");
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;
                case 4:
                    System.out.println("Students Catalog: ");
                    for (Map.Entry<String, Integer> it : studentCatalog.entrySet()) {
                        System.out.println(it.getKey()+" : "+it.getValue());
                    }
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Try again from 1 to 5.");
            }
        }
    }
}
