/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Xyjor
 */
public class Queue {

   
    private int maxSize;
    private int front, rear;
    private int[] queue;

    Queue(int size) {
        maxSize = size;
        queue = new int[maxSize];
        front = 0;
        rear = -1;
    }
    

    void enqueue(int value) {
        if (rear == maxSize - 1) {
            throw new RuntimeException("Queue Full");
        } else {
            queue[++rear] = value;
        }
    }

    void dequeue() {
        if (front > rear) {
            throw new RuntimeException("Queue Empty");
        } else {
            front++;
        }
    }

    int peek() {
        if (front > rear) {
            throw new RuntimeException("Queue is empty");
        }
        return queue[front];
    }

    boolean isEmpty() {
        return front > rear;
    }

    boolean isFull() {
        return rear == maxSize - 1;
    }

    String display() {
        if (isEmpty()) {
            return "Queue is empty";
        }
        StringBuilder sb = new StringBuilder("Queue contents: ");
        for (int i = front; i <= rear; i++) {
            sb.append(queue[i]).append(" ");
        }
        return sb.toString();
    }
}
