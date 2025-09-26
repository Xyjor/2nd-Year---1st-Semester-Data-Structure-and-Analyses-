/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DoublyLinked;

/**
 *
 * @author Xyjor
 */
public class DoublyMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.insertAtHead(10);
        list.insertAtHead(5);
        list.insertAtTail(20);
        list.insertAtTail(25);

        list.traverseForward();   // Forward: 5 10 20 25
        list.traverseBackward();  // Backward: 25 20 10 5

        list.deleteByValue(10);
        list.traverseForward();   // Forward: 5 20 25
        list.traverseBackward();  // Backward: 25 20 5

        list.deleteByValue(25);
        list.traverseForward();   // Forward: 5 20
        list.traverseBackward();  // Backward: 20 5
    }
}
