/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labone;

/**
 *
 * @author YANGYANG_CPE
 */
public class LabOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayInsert method = new ArrayInsert();
        
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Original Array");
        method.PrintArray(array);
        
        int position = 2;
        int value = 99;
        array = method.insertAtPosition(array, position, value);
        
        System.out.println("Array after Insertion");
        method.PrintArray(array);
        
    }
    
}
