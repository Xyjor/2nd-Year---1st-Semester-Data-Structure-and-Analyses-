/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PracticeProblem3;

import java.util.Arrays;

/**
 *
 * @author Xyjor
 */
public class LeaderBoardRank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Sample list of scores (modify as needed)
        int[] scores = {85, 92, 78, 88, 95, 75, 82, 100, 73};

        System.out.println("Before sorting (original scores): " + Arrays.toString(scores));

        // Use Insertion Sort to rank from highest to lowest
        insertionSortDescending(scores);

        System.out.println("After sorting (leaderboard - highest to lowest): " + Arrays.toString(scores));
    }

    // Insertion Sort modified for descending order (highest to lowest)
    public static void insertionSortDescending(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            // Shift elements that are less than the key (for descending order)
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }
            // Insert the key into its correct position
            arr[j + 1] = key;
        }
    }

}
