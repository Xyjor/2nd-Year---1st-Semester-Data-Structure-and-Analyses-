/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TasksIntegrated;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Xyjor
 */
public class HashMapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        class Student {

            String id;
            String name;
            double grade;

            public Student(String id, String name, double grade) {
                this.id = id;
                this.name = name;
                this.grade = grade;
            }

            @Override
            public String toString() {
                return "ID: " + id + ", Name: " + name + ", Grade: " + grade;
            }
        }

        Scanner sc = new Scanner(System.in);

        // ------------------ Task 1: HashMap Basics ------------------
        System.out.println("=== Task 1: HashMap Basics ===");
        HashMap<String, Double> grades = new HashMap<>();

        // Adding entries
        grades.put("James", 89.5);
        grades.put("Daryl", 91.0);
        grades.put("Karl", 85.5);
        System.out.println("Added entries: " + grades);

        // Retrieving a grade
        System.out.println("Grade of James: " + grades.get("James"));

        // Checking if a student exists
        System.out.println("Does Daryl exist? " + grades.containsKey("Daryl"));

        // Removing a student
        grades.remove("Karl");
        System.out.println("After removing Karl: " + grades);

        // ------------------ Task 2: Iterating Through HashMap ------------------
        System.out.println("\n=== Task 2: Iterating Through HashMap ===");
        for (Map.Entry<String, Double> entry : grades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // ------------------ Task 3: HashMap of Objects ------------------
        System.out.println("\n=== Task 3: HashMap of Student Objects ===");
        HashMap<String, Student> students = new HashMap<>();

        // Adding student records
        students.put("2025-001", new Student("2025-001", "James", 89.5));
        students.put("2025-002", new Student("2025-002", "Daryl", 91.0));

        // Updating a student record
        students.put("2025-001", new Student("2025-001", "James", 92.0));

        // Retrieving by ID
        System.out.println("Student 2025-001: " + students.get("2025-001"));

        // Displaying all student records
        System.out.println("All student records:");
        for (Map.Entry<String, Student> entry : students.entrySet()) {
            System.out.println(entry.getValue());
        }

        // ------------------ Task 4: Mini Application – Product Inventory ------------------
        System.out.println("\n=== Task 4: Product Inventory ===");
        HashMap<String, Integer> inventory = new HashMap<>();
        boolean exit = false;

        while (!exit) {
            System.out.println("\n1. Add product");
            System.out.println("2. Update stock");
            System.out.println("3. Display inventory");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter product code: ");
                    String code = sc.nextLine();
                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();
                    inventory.put(code, qty);
                    System.out.println("Product added.");
                    break;
                case 2:
                    System.out.print("Enter product code to update: ");
                    String updateCode = sc.nextLine();
                    if (inventory.containsKey(updateCode)) {
                        System.out.print("Enter new quantity: ");
                        int newQty = sc.nextInt();
                        inventory.put(updateCode, newQty);
                        System.out.println("Stock updated.");
                    } else {
                        System.out.println("Product not found!");
                    }
                    break;
                case 3:
                    System.out.println("Inventory:");
                    for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option!");
            }
            sc.nextLine(); // consume newline
        }

        sc.close();
        System.out.println("Program ended.");
    }

}
