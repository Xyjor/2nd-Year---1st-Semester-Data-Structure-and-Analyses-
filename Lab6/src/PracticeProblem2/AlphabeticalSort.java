/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PracticeProblem2;

import java.util.Arrays;

/**
 *
 * @author Xyjor
 */
public class AlphabeticalSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Sample array of names (modify as needed)
        String[] names = {"Rojyx", "James", "Daryl", "Karl", "Ulysses", "Peter", "Lian", "Asherjesse"};

        System.out.println("Before sorting: " + Arrays.toString(names));

        // Implement Selection Sort for alphabetical order
        selectionSort(names);

        System.out.println("After sorting (alphabetical): " + Arrays.toString(names));
    }

    // Selection Sort: Finds the minimum element in the unsorted portion and swaps it with the first unsorted element
    // Adapted for Strings using compareTo() for alphabetical comparison
    public static void selectionSort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            // Find the index of the minimum (alphabetically smallest) element in the remaining unsorted array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element of the unsorted portion
            if (minIndex != i) {
                String temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

}
