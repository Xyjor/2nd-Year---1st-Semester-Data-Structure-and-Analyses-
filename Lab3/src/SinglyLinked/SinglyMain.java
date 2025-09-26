/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SinglyLinked;

/**
 *
 * @author Xyjor
 */
public class SinglyMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtHead(10);
        list.insertAtHead(5);
        list.insertAtTail(20);
        list.insertAtTail(25);

        list.traverseForward();  // Output: List: 5 10 20 25

        list.deleteByValue(10);
        list.traverseForward();  // Output: List: 5 20 25

        list.deleteByValue(5);
        list.traverseForward();  // Output: List: 20 25
    }
}
