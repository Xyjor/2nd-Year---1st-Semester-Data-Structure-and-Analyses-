/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem1;

/**
 *
 * @author Xyjor
 */
public class StudentRecordSystem {
    // StudentNode class representing a node in BST

    static class StudentNode {

        int studentID;
        String studentName;
        StudentNode left, right;

        public StudentNode(int studentID, String studentName) {
            this.studentID = studentID;
            this.studentName = studentName;
            this.left = null;
            this.right = null;
        }
    }

    // BST class for managing student records
    static class StudentBST {

        private StudentNode root;

        public StudentBST() {
            root = null;
        }

        // Insert method - inserts ordered by studentID
        public void insert(int studentID, String studentName) {
            root = insertRec(root, studentID, studentName);
        }

        private StudentNode insertRec(StudentNode root, int studentID, String studentName) {
            if (root == null) {
                root = new StudentNode(studentID, studentName);
                return root;
            }
            if (studentID < root.studentID) {
                root.left = insertRec(root.left, studentID, studentName);
            } else if (studentID > root.studentID) {
                root.right = insertRec(root.right, studentID, studentName);
            } else {
                // If the studentID already exists, update the name or ignore
                // Here we update the name
                root.studentName = studentName;
            }
            return root;
        }

        // Search method by studentID
        public StudentNode search(int studentID) {
            return searchRec(root, studentID);
        }

        private StudentNode searchRec(StudentNode root, int studentID) {
            if (root == null || root.studentID == studentID) {
                return root;
            }
            if (studentID < root.studentID) {
                return searchRec(root.left, studentID);
            } else {
                return searchRec(root.right, studentID);
            }
        }

        // Inorder traversal to display students sorted by ID
        public void inorderTraversal() {
            inorderRec(root);
            System.out.println();
        }

        private void inorderRec(StudentNode root) {
            if (root != null) {
                inorderRec(root.left);
                System.out.println("ID: " + root.studentID + ", Name: " + root.studentName);
                inorderRec(root.right);
            }
        }
    }

    public static void main(String[] args) {
        StudentBST studentTree = new StudentBST();

        // Insert students
        studentTree.insert(1003, "Peter");
        studentTree.insert(1001, "Ulysses");
        studentTree.insert(1002, "James");
        studentTree.insert(1005, "Joseph Karl");
        studentTree.insert(1004, "Naldrelle");
        studentTree.insert(1010, "Daryl");

        // Search for a student
        int searchID = 1002;
        StudentNode found = studentTree.search(searchID);
        if (found != null) {
            System.out.println("Student found: ID = " + found.studentID + ", Name = " + found.studentName);
        } else {
            System.out.println("Student with ID " + searchID + " not found.");
        }

        // Display all students sorted by ID
        System.out.println("\nAll students sorted by ID:");
        studentTree.inorderTraversal();
    }
}
