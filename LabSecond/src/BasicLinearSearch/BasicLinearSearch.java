/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BasicLinearSearch;

import java.util.Scanner;

/**
 *
 * @author Xyjor
 */
public class BasicLinearSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        int[] numbers = {4, 7, 1, 9, 3, 12, 5};

        System.out.print("Enter the number to search: ");
        int target = in.nextInt();

        int index = linearSearch(numbers, target);

        if (index == -1) {
            System.out.println("Number " + target + " not found in the array.");
        } else {
            System.out.println("Number " + target + " found at index " + index + ".");
        }

    }

    // Method to perform Linear Search
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; 
            }
        }
        return -1; 
    }
}
