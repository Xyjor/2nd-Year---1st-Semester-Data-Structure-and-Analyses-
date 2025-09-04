/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeleteAtPosition;

/**
 *
 * @author Xyjor
 */
public class DeleteMethod {

    public static int[] DeleteAt(int[] array, int position) {

        if (position < 0 || position >= array.length) {
            System.out.println("Invalid Position!!!");
            return array;
        }

        int[] newArray = new int[array.length - 1];

        for (int i = 0; i < position; i++) {
            newArray[i] = array[i];
        }

        for (int i = position; i < newArray.length; i++) {
            newArray[i] = array[i + 1];
        }
        return newArray;
    }

    
}
