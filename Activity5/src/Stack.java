/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Xyjor
 */
public class Stack {

    private int maxSize;
    private int top;
    private int[] stack;

    Stack(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1;
    }

    void push(int value) {
        if (top == maxSize - 1) {
            throw new RuntimeException("Stack Overflow");
        } else {
            stack[++top] = value;
        }
    }

    void pop() {
        if (top == -1) {
            throw new RuntimeException("Stack Underflow");
        } else {
            top--;
        }
    }

    int peek() {
        if (top == -1) {
            throw new RuntimeException("Stack is empty");
        }
        return stack[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == maxSize - 1;
    }

    String display() {
        if (isEmpty()) {
            return "Stack is empty";
        }
        StringBuilder sb = new StringBuilder("Stack contents: ");
        for (int i = 0; i <= top; i++) {
            sb.append(stack[i]).append(" ");
        }
        return sb.toString();
    }
}
