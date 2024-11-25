import Forms.*;
import Objects.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        StudentView studentView = new StudentView(studentManager);
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Search Student by Name");
            System.out.println("6. Search Student by ID");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear the newline

            switch (choice) {
                case 1:
                    studentView.inputStudent();
                    break;
                case 2:
                    System.out.print("Enter Student ID to update: ");
                    String updateId = scanner.nextLine();
                    Student updatedStudent = studentView.createStudentFromInput();
                    studentManager.updateStudent(updateId, updatedStudent);
                    System.out.println("Student updated successfully.");
                    break;
                case 3:
                    System.out.print("Enter Student ID to delete: ");
                    String deleteId = scanner.nextLine();
                    studentManager.removeStudent(deleteId);
                    System.out.println("Student deleted successfully.");
                    break;
                case 4:
                    studentView.displayStudents();
                    break;
                case 5:
                    System.out.print("Enter Student Name to search: ");
                    String searchName = scanner.nextLine();
                    Student foundByName = studentManager.findStudentByName(searchName);
                    if (foundByName != null) {
                        System.out.println("Student found: " + foundByName.getFullName());
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 6:
                    System.out.print("Enter Student ID to search: ");
                    String searchId = scanner.nextLine();
                    Student foundById = studentManager.findStudentById(searchId);
                    if (foundById != null) {
                        System.out.println("Student found: " + foundById.getFullName());
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 0:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}

