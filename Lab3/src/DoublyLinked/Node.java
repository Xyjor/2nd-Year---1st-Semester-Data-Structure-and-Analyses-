/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoublyLinked;

/**
 *
 * @author Xyjor
 */
public class Node {

    int data;       // value stored in the node
    Node next;      // link to next node
    Node prev;      // link to previous node

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
