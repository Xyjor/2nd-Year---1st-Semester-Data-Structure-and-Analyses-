/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PracticeProblem3;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Xyjor
 */
public class FrequencyCounter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input sentence
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Create HashMap
        HashMap<Character, Integer> frequency = new HashMap<>();

        // Count letter occurrences
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            // Consider letters only
            if (Character.isLetter(ch)) {
                ch = Character.toUpperCase(ch);

                if (frequency.containsKey(ch)) {
                    frequency.put(ch, frequency.get(ch) + 1);
                } else {
                    frequency.put(ch, 1);
                }
            }
        }

        // Display result
        System.out.println("\nLetter Frequencies:");
        for (Character key : frequency.keySet()) {
            System.out.println(key + " = " + frequency.get(key));
        }
    }

}
