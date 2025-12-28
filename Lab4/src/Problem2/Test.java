/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Problem2;

/**
 *
 * @author Xyjor
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ExpressionTree et = new ExpressionTree();
        String postfix = "3 4 + 2 * 7 /";

        Node root = et.constructTree(postfix);

        System.out.print("Infix expression: ");
        et.inorder(root);
        System.out.println();

        double result = et.evaluate(root);
        System.out.println("Evaluated result (Postorder): " + result);
    }
}


