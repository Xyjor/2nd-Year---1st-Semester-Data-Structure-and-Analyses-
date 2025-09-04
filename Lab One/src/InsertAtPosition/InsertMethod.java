/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InsertAtPosition;

/**
 *
 * @author Xyjor
 */
public class InsertMethod {

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
}
