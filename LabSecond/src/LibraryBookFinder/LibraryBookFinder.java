/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LibraryBookFinder;

import java.util.Scanner;

/**
 *
 * @author Xyjor
 */
public class LibraryBookFinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Sample list of book titles (with duplicates)
        String[] books = {
            "DE",
            "DSA",
            "Circuits",
            "DE",
            "SQL",
            "DE",
            "Arts App",
            "DSA"
        };

        System.out.print("Enter book title to search: ");
        String target = in.nextLine().trim();

        int count = findBookCount(books, target);

        if (count == 0) {
            System.out.println("The book \"" + target + "\" is not available in the library.");
        } else {
            System.out.println("The book \"" + target + "\" is available.");
            System.out.println("Number of copies: " + count);
        }

    }

    // Linear search that counts duplicates
    public static int findBookCount(String[] books, String title) {
        int count = 0;
        for (String book : books) {

            if (book.equalsIgnoreCase(title)) {
                count++;
            }
        }
        return count;
    }
}
