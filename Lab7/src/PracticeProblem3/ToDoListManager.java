/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PracticeProblem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Xyjor
 */
public class ToDoListManager {

    private static ArrayList<Task> tasks = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n--- To-Do List Manager ---");
            System.out.println("1. Add Task");
            System.out.println("2. Update Task");
            System.out.println("3. Display Tasks");
            System.out.println("4. Sort by Priority");
            System.out.println("5. Sort Alphabetically");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1 ->
                    addTask();
                case 2 ->
                    updateTask();
                case 3 ->
                    displayTasks();
                case 4 ->
                    sortByPriority();
                case 5 ->
                    sortAlphabetically();
                case 0 ->
                    System.out.println("Exiting...");
                default ->
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }

    private static void addTask() {
        sc.nextLine();
        System.out.print("Enter task description: ");
        String description = sc.nextLine();

        System.out.print("Enter priority (lower = higher priority): ");
        int priority = sc.nextInt();

        tasks.add(new Task(description, priority));
        System.out.println("Task added.");
    }

    private static void updateTask() {
        sc.nextLine();
        System.out.print("Enter task description to update: ");
        String desc = sc.nextLine();

        for (Task t : tasks) {
            if (t.getDescription().equalsIgnoreCase(desc)) {

                System.out.print("Enter new description: ");
                String newDesc = sc.nextLine();

                System.out.print("Enter new priority: ");
                int newPriority = sc.nextInt();

                t.setDescription(newDesc);
                t.setPriority(newPriority);

                System.out.println("Task updated.");
                return;
            }
        }
        System.out.println("Task not found.");
    }

    private static void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }

        for (Task t : tasks) {
            System.out.println(t);
        }
    }

    // Uses Collections.sort() → compareTo()
    private static void sortByPriority() {
        Collections.sort(tasks);
        System.out.println("Tasks sorted by priority.");
    }

    // Alphabetical sorting using Collections.sort() with lambda
    private static void sortAlphabetically() {
        Collections.sort(tasks, (a, b)
                -> a.getDescription().compareToIgnoreCase(b.getDescription())
        );
        System.out.println("Tasks sorted alphabetically.");
    }

}
