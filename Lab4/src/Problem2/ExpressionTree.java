/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem2;

import java.util.Stack;

/**
 *
 * @author Xyjor
 */
public class ExpressionTree {

    // Function to check if a string is an operator
    boolean isOperator(String c) {
        return c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/");
    }

    // Build expression tree from postfix expression
    Node constructTree(String postfix) {
        Stack<Node> stack = new Stack<>();
        String[] tokens = postfix.split(" ");

        for (String token : tokens) {
            if (!isOperator(token)) {
                // Operand → create node and push to stack
                stack.push(new Node(token));
            } else {
                // Operator → pop two nodes and make them children
                Node node = new Node(token);
                node.right = stack.pop();
                node.left = stack.pop();
                stack.push(node);
            }
        }

        // The remaining node in stack is root
        return stack.peek();
    }

    // Inorder traversal → infix expression
    void inorder(Node node) {
        if (node != null) {
            if (isOperator(node.value)) {
                System.out.print("(");
            }
            inorder(node.left);
            System.out.print(node.value);
            inorder(node.right);
            if (isOperator(node.value)) {
                System.out.print(")");
            }
        }
    }

    // Postorder traversal → evaluate expression
    double evaluate(Node node) {
        if (node == null) {
            return 0;
        }

        // If leaf node → operand
        if (!isOperator(node.value)) {
            return Double.parseDouble(node.value);
        }

        // Otherwise evaluate left and right
        double leftVal = evaluate(node.left);
        double rightVal = evaluate(node.right);

        switch (node.value) {
            case "+":
                return leftVal + rightVal;
            case "-":
                return leftVal - rightVal;
            case "*":
                return leftVal * rightVal;
            case "/":
                return leftVal / rightVal;
        }

        return 0;
    }

}
