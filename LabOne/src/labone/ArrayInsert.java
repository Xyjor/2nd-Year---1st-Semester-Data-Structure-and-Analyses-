/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labone;

import javax.swing.text.Position;

/**
 *
 * @author YANGYANG_CPE
 */
public class ArrayInsert {

    public static int[] insertAtPosition(int[] array, int position, int value) {
        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < position;
                i++) {
            newArray[i] = array[i];
        }

        newArray[position] = value;

        for (int i = position; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }
        return newArray;
    }

    public static void PrintArray(int[] array) {
        for (int i : array) {
            System.out.println(i + "");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Original Array:");
        PrintArray(array);

        int position = 2;
        int value = 99;
        array = insertAtPosition(array, position, value);

        System.out.println("Array after insertion:");
        PrintArray(array);
    }
}
