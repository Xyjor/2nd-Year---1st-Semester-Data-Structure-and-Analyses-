/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Problem3;

/**
 *
 * @author Xyjor
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BST tree = new BST();
        // Insert some values to build the tree
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);
        // Print inorder traversal for verification
        System.out.print("Inorder Traversal: ");
        tree.inorder();
        // Find and print height
        System.out.println("Height of the tree: " + tree.findHeight());
        // Count and print leaves
        System.out.println("Number of leaves: " + tree.countLeaves());
    }

}
