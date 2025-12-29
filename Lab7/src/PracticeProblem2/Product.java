/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticeProblem2;

/**
 *
 * @author Xyjor
 */
public class Product implements Comparable<Product> {

    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Total value of a product
    public double getTotalValue() {
        return price * quantity;
    }

    // Default sorting: by PRICE
    @Override
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price);
    }

    @Override
    public String toString() {
        return "Product: " + name
                + ", Price: " + price
                + ", Quantity: " + quantity;
    }
}
