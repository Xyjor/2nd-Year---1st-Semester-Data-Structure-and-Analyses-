/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package StudentIDLookUp;

import java.util.Scanner;

/**
 *
 * @author Xyjor
 */
public class StudentIDLookUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Student[] students = {
            new Student(1001, "Daryl"),
            new Student(1002, "Karl"),
            new Student(1003, "James"),
            new Student(1004, "Peter"),
            new Student(1005, "Ulysses")
        };

        System.out.print("Enter Student ID to search: ");
        int targetId = in.nextInt();

        int index = findStudentById(students, targetId);

        if (index == -1) {
            System.out.println("Student ID " + targetId + " not found.");
        } else {
            System.out.println("Student found!");
            System.out.println("ID: " + students[index].id
                    + ", Name: " + students[index].name);
        }
    }

    public static int findStudentById(Student[] list, int id) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].id == id) {
                return i;
            }
        }
        return -1;
    }
}
