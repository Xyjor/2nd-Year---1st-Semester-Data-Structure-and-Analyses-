/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalproject;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Xyjor
 */
public class LibraryInventorySystem {

    static ArrayList<Book> books = new ArrayList<>();
    static HashMap<String, Book> bookMap = new HashMap<>();
    static Stack<Book> transactionStack = new Stack<>();
    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n=== Library Inventory System ===");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book by ISBN");
            System.out.println("4. Sort Books by Title");
            System.out.println("5. Sort Books by Year");
            System.out.println("6. Borrow Book");
            System.out.println("7. Return Book");
            System.out.println("8. Undo Last Transaction");
            System.out.println("9. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 ->
                    addBook();
                case 2 ->
                    viewBooks();
                case 3 ->
                    searchBook();
                case 4 ->
                    sortByTitle();
                case 5 ->
                    sortByYear();
                case 6 ->
                    borrowBook();
                case 7 ->
                    returnBook();
                case 8 ->
                    undoTransaction();
                case 9 ->
                    System.out.println("Exiting system...");
                default ->
                    System.out.println("Invalid choice.");
            }
        } while (choice != 9);
    }

    static void addBook() {
        System.out.print("Enter ISBN: ");
        String isbn = sc.nextLine();

        if (bookMap.containsKey(isbn)) {
            System.out.println("Book already exists.");
            return;
        }

        System.out.print("Enter Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author: ");
        String author = sc.nextLine();

        System.out.print("Enter Publication Year: ");
        int year = sc.nextInt();

        Book book = new Book(isbn, title, author, year);
        books.add(book);
        bookMap.put(isbn, book);

        System.out.println("Book added successfully.");
    }

    static void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("Library is empty.");
            return;
        }

        for (Book b : books) {
            System.out.println(
                    b.isbn + " | "
                    + b.title + " | "
                    + b.author + " | "
                    + b.year + " | "
                    + (b.isBorrowed ? "Borrowed" : "Available")
            );
        }
    }

    static void searchBook() {
        System.out.print("Enter ISBN: ");
        String isbn = sc.nextLine();

        Book b = bookMap.get(isbn);
        if (b != null) {
            System.out.println("Found: " + b.title + " (" + b.year + ")");
        } else {
            System.out.println("Book not found.");
        }
    }

    static void sortByTitle() {
        Collections.sort(books, Comparator.comparing(b -> b.title));
        System.out.println("Books sorted by title.");
    }

    static void sortByYear() {
        Collections.sort(books, Comparator.comparingInt(b -> b.year));
        System.out.println("Books sorted by publication year.");
    }

    static void borrowBook() {
        System.out.print("Enter ISBN to borrow: ");
        String isbn = sc.nextLine();

        Book b = bookMap.get(isbn);
        if (b != null && !b.isBorrowed) {
            b.isBorrowed = true;
            transactionStack.push(b);
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book unavailable.");
        }
    }

    static void returnBook() {
        System.out.print("Enter ISBN to return: ");
        String isbn = sc.nextLine();

        Book b = bookMap.get(isbn);
        if (b != null && b.isBorrowed) {
            b.isBorrowed = false;
            transactionStack.push(b);
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Invalid return.");
        }
    }

    static void undoTransaction() {
        if (transactionStack.isEmpty()) {
            System.out.println("No transaction to undo.");
            return;
        }

        Book b = transactionStack.pop();
        b.isBorrowed = !b.isBorrowed;
        System.out.println("Last transaction undone.");
    }

}
