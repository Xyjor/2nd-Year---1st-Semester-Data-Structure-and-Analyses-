/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PracticeProblem1;

import java.util.HashMap;

/**
 *
 * @author Xyjor
 */
public class StudentDirectory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        HashMap<String, Students> students = new HashMap<>();

        students.put("ID001", new Students("ID001", "Karl", 89.5));
        students.put("ID002", new Students("ID002", "James", 91.0));
        students.put("ID003", new Students("ID003", "Daryl", 85.5));
        students.put("ID004", new Students("ID004", "Peter", 88.0));
        students.put("ID005", new Students("ID005", "Rojyx", 92.5));

        System.out.println("All students added.\n");

        // ---------------- Retrieve student by ID ----------------
        String searchID = "ID003";
        Students student = students.get(searchID);

        if (student != null) {
            System.out.println("Retrieved Student:");
            System.out.println(student);
        } else {
            System.out.println("Student not found.");
        }

        // ---------------- Update grade for a specific student ----------------
        String updateID = "ID002";
        if (students.containsKey(updateID)) {
            students.get(updateID).grade = 95.0;
            System.out.println("\nUpdated Grade:");
            System.out.println(students.get(updateID));
        } else {
            System.out.println("Student not found for update.");
        }
    }

}
