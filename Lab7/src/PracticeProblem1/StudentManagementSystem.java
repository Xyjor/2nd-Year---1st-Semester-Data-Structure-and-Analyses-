/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PracticeProblem1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Xyjor
 */
public class StudentManagementSystem {

    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student by ID");
            System.out.println("3. Remove Student by ID");
            System.out.println("4. Sort by Name");
            System.out.println("5. Sort by Grade");
            System.out.println("6. Display Students");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1 ->
                    addStudent();
                case 2 ->
                    searchStudent();
                case 3 ->
                    removeStudent();
                case 4 ->
                    sortByName();
                case 5 ->
                    sortByGrade();
                case 6 ->
                    displayStudents();
                case 0 ->
                    System.out.println("Exiting...");
                default ->
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }

    private static void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter grade: ");
        double grade = sc.nextDouble();

        students.add(new Student(id, name, grade));
        System.out.println("Student added.");
    }

    private static void searchStudent() {
        System.out.print("Enter ID to search: ");
        int id = sc.nextInt();

        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println("Found: " + s);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    private static void removeStudent() {
        System.out.print("Enter ID to remove: ");
        int id = sc.nextInt();

        for (Student s : students) {
            if (s.getId() == id) {
                students.remove(s);
                System.out.println("Student removed.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Uses Collections.sort() with compareTo()
    private static void sortByName() {
        Collections.sort(students);
        System.out.println("Sorted by name.");
    }

    // Sort by grade using anonymous Comparable logic
    private static void sortByGrade() {
        Collections.sort(students, (a, b)
                -> Double.compare(a.getGrade(), b.getGrade())
        );
        System.out.println("Sorted by grade.");
    }

    private static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students.");
            return;
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }

}
