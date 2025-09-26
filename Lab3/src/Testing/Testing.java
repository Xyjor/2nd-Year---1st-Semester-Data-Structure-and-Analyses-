/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Testing;

/**
 *
 * @author Xyjor
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        System.out.println("=== INSERT ELEMENTS ===");
        // Insert at head
        list.insertAtHead(10);
        list.insertAtHead(5);

        // Insert at tail
        list.insertAtTail(20);
        list.insertAtTail(25);

        // Traverse both directions
        list.traverseForward();   // Forward: 5 10 20 25
        list.traverseBackward();  // Backward: 25 20 10 5

        System.out.println("\n=== DELETE SPECIFIC VALUE (10) ===");
        // Delete a specific value
        list.deleteByValue(10);

        // Traverse again
        list.traverseForward();   // Forward: 5 20 25
        list.traverseBackward();  // Backward: 25 20 5

        System.out.println("\n=== DELETE TAIL VALUE (25) ===");
        list.deleteByValue(25);
        list.traverseForward();   // Forward: 5 20
        list.traverseBackward();  // Backward: 20 5
    }
}
