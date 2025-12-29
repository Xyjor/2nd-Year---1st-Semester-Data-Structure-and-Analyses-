/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PracticeProblem2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Xyjor
 */
public class ProductInventory {

    private static ArrayList<Product> products = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n--- Product Inventory System ---");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product by Name");
            System.out.println("3. Display Products");
            System.out.println("4. Compute Total Inventory Value");
            System.out.println("5. Sort by Price");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1 ->
                    addProduct();
                case 2 ->
                    removeProduct();
                case 3 ->
                    displayProducts();
                case 4 ->
                    computeTotalValue();
                case 5 ->
                    sortByPrice();
                case 0 ->
                    System.out.println("Exiting...");
                default ->
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }

    private static void addProduct() {
        sc.nextLine(); // consume newline

        System.out.print("Enter product name: ");
        String name = sc.nextLine();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        products.add(new Product(name, price, quantity));
        System.out.println("Product added.");
    }

    private static void removeProduct() {
        sc.nextLine();
        System.out.print("Enter product name to remove: ");
        String name = sc.nextLine();

        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name)) {
                products.remove(p);
                System.out.println("Product removed.");
                return;
            }
        }
        System.out.println("Product not found.");
    }

    private static void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }

        for (Product p : products) {
            System.out.println(p + ", Total Value: " + p.getTotalValue());
        }
    }

    private static void computeTotalValue() {
        double total = 0;

        for (Product p : products) {
            total += p.getTotalValue();
        }

        System.out.println("Total Inventory Value: " + total);
    }

    // Uses Collections.sort() → compareTo()
    private static void sortByPrice() {
        Collections.sort(products);
        System.out.println("Products sorted by price.");

    }

}
