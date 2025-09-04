/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DeleteAtPosition;

import java.util.Scanner;

/**
 *
 * @author Xyjor
 */
public class DeleteArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DeleteMethod method = new DeleteMethod();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int position;

        System.out.println("""
                           Here is your array:
                           Value: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
                           Index: [0][1][2][3][4][5][6][7][8]10[9]
                           
                           Choose the Position/Index of the value that you want to delete: 
                           """);

        position = in.nextInt();

        if (position < 0 || position >= array.length) {
            System.out.println("Invalid Position!!!");
            return;
        }

        System.out.println("Original Array:");
        for (int n : array) {
            System.out.print(n + " ");
        }
        System.out.println("");

        array = method.DeleteAt(array, position);

        System.out.println("After deletion: ");
        for (int n : array) {
            System.out.print(n + " ");
        }
        System.out.println("");

    }
}
