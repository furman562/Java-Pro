package Homework10;

import java.util.Arrays;
import java.util.List;

public class Realization {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Book", 200),
                new Product("Book", 300),
                new Product("Toy", 50),
                new Product("Toy", 100),
                new Product("Book", 80, true),
                new Product("Book", 120, true),
                new Product("Toy", 150, true)
        );

        ProductManager productManager = new ProductManager();

        System.out.println("Expensive Books: " + productManager.getExpensiveBooks(products));
        System.out.println("Discounted Books: " + productManager.getDiscountedBooks(products));
        System.out.println("Cheapest Book: " + productManager.findCheapestBook(products));
        System.out.println("Last Three Added Products: " + productManager.getLastThreeAddedProducts(products));
        System.out.println("Total Cost of Discounted Books: " + productManager.calculateTotalCost(products));
        System.out.println("Grouped Products by Type: " + productManager.groupProductsByType(products));
    }
}

