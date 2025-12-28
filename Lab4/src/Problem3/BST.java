/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem3;

/**
 *
 * @author Xyjor
 */
public class BST {

    Node root;

    BST() {
        root = null;
    }

    void insert(int val) {
        root = insertRec(root, val);
    }

    private int findHeightRec(Node node) {
        if (node == null) {
            return 0;  // Height of empty tree is 0
        }
        int leftHeight = findHeightRec(node.left);
        int rightHeight = findHeightRec(node.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    private Node insertRec(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (val < root.data) {
            root.left = insertRec(root.left, val);
        } else if (val > root.data) {
            root.right = insertRec(root.right, val);
        }
        return root;
    }

    // Find the height of the tree
    int findHeight() {
        return findHeightRec(root);
    }

    // Count the number of leaf nodes
    int countLeaves() {
        return countLeavesRec(root);
    }

    private int countLeavesRec(Node node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;  // This is a leaf
        }
        return countLeavesRec(node.left) + countLeavesRec(node.right);
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    void inorder() {
        inorderRec(root);
        System.out.println();
    }

}
