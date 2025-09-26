/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Testing;

/**
 *
 * @author Xyjor
 */
public class DoublyLinkedList {

    private Node head;   // first node
    private Node tail;   // last node (helps with backward traversal)

    // Insert at the beginning
    public void insertAtHead(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Insert at the end
    public void insertAtTail(int value) {
        Node newNode = new Node(value);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Delete the first node with the given value
    public void deleteByValue(int value) {
        if (head == null) {
            return;
        }

        Node current = head;
        while (current != null && current.data != value) {
            current = current.next;
        }
        if (current == null) {
            return; // value not found
        }
        // If current is head
        if (current == head) {
            head = current.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null; // list is now empty
            }
            return;
        }

        // If current is tail
        if (current == tail) {
            tail = current.prev;
            if (tail != null) {
                tail.next = null;
            } else {
                head = null;
            }
            return;
        }

        // If current is in the middle
        current.prev.next = current.next;
        current.next.prev = current.prev;
    }

    // Traverse forward from head
    public void traverseForward() {
        Node current = head;
        System.out.print("Forward: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Traverse backward from tail
    public void traverseBackward() {
        Node current = tail;
        System.out.print("Backward: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }
}
