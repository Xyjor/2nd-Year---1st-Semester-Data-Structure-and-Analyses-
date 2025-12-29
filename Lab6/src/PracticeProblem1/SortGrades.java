/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PracticeProblem1;

import java.util.Arrays;

/**
 *
 * @author Xyjor
 */
public class SortGrades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Sample list of student grades (modify as needed)
        int[] originalGrades = {85, 92, 78, 88, 95, 67, 73, 89};

        System.out.println("Original grades: " + Arrays.toString(originalGrades));
        System.out.println();

        // Sort with Bubble Sort and measure time
        int[] gradesForBubble = originalGrades.clone();
        long startTime = System.nanoTime();
        bubbleSort(gradesForBubble);
        long endTime = System.nanoTime();
        long bubbleTime = endTime - startTime;
        System.out.println("Bubble Sort result: " + Arrays.toString(gradesForBubble));
        System.out.println("Bubble Sort runtime: " + bubbleTime + " nanoseconds");
        System.out.println();

        // Sort with Selection Sort and measure time
        int[] gradesForSelection = originalGrades.clone();
        startTime = System.nanoTime();
        selectionSort(gradesForSelection);
        endTime = System.nanoTime();
        long selectionTime = endTime - startTime;
        System.out.println("Selection Sort result: " + Arrays.toString(gradesForSelection));
        System.out.println("Selection Sort runtime: " + selectionTime + " nanoseconds");
        System.out.println();

        // Sort with Insertion Sort and measure time
        int[] gradesForInsertion = originalGrades.clone();
        startTime = System.nanoTime();
        insertionSort(gradesForInsertion);
        endTime = System.nanoTime();
        long insertionTime = endTime - startTime;
        System.out.println("Insertion Sort result: " + Arrays.toString(gradesForInsertion));
        System.out.println("Insertion Sort runtime: " + insertionTime + " nanoseconds");
        System.out.println();

        // Runtime comparison summary
        System.out.println("=== Runtime Comparison ===");
        System.out.println("Bubble Sort: " + bubbleTime + " ns");
        System.out.println("Selection Sort: " + selectionTime + " ns");
        System.out.println("Insertion Sort: " + insertionTime + " ns");
        System.out.println("Fastest: " + (Math.min(Math.min(bubbleTime, selectionTime), insertionTime) == bubbleTime ? "Bubble Sort"
                : Math.min(Math.min(bubbleTime, selectionTime), insertionTime) == selectionTime ? "Selection Sort" : "Insertion Sort"));
    }

    // Bubble Sort: Repeatedly swaps adjacent elements if they are in the wrong order
    public static void bubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    // Selection Sort: Finds the minimum element in the unsorted portion and swaps it with the first unsorted element
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    // Insertion Sort: Builds the sorted array one element at a time by inserting each element into its correct position
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

}
