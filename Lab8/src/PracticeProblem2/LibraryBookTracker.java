/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PracticeProblem2;

import java.util.HashMap;

/**
 *
 * @author Xyjor
 */
public class LibraryBookTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        HashMap<String, Integer> library = new HashMap<>();

        // ---------------- Add books ----------------
        library.put("Java Programming", 3);
        library.put("Data Structures", 5);
        library.put("Operating Systems", 2);

        System.out.println("Books added:");
        displayLibrary(library);

        // ---------------- Borrow a book ----------------
        String borrowBook = "Java Programming";
        if (library.containsKey(borrowBook) && library.get(borrowBook) > 0) {
            library.put(borrowBook, library.get(borrowBook) - 1);
            System.out.println("\nBorrowed: " + borrowBook);
        } else {
            System.out.println("\nBook not available for borrowing.");
        }
        displayLibrary(library);

        // ---------------- Return a book ----------------
        String returnBook = "Java Programming";
        if (library.containsKey(returnBook)) {
            library.put(returnBook, library.get(returnBook) + 1);
            System.out.println("\nReturned: " + returnBook);
        }
        displayLibrary(library);

        // ---------------- Remove a book ----------------
        String removeBook = "Operating Systems";
        library.remove(removeBook);
        System.out.println("\nRemoved book: " + removeBook);
        displayLibrary(library);
    }

    // Display all books (still HashMap only)
    public static void displayLibrary(HashMap<String, Integer> library) {
        for (String title : library.keySet()) {
            System.out.println(title + " - Copies: " + library.get(title));
        }

    }

}
