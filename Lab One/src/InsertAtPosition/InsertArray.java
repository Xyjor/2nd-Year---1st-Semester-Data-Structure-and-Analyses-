/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package InsertAtPosition;

import java.util.Scanner;

/**
 *
 * @author Xyjor
 */
public class InsertArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        InsertMethod method = new InsertMethod();

        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Original Array");
        method.PrintArray(array);

        System.out.println("Enter the position and the value you want to insert in.");
        System.out.printf("Position [0 -> 5]: ");
        int position = in.nextInt();

        if (position > array.length) {
            throw new IndexOutOfBoundsException("Index range is out of bounds !!");
        }

        System.out.printf("\nValue [Any value]: ");
        int value = in.nextInt();
        array = method.insertAtPosition(array, position, value);

        System.out.println("Array after Insertion");
        method.PrintArray(array);

    }

}
