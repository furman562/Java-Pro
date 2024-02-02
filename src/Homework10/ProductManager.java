package Homework10;
import java.util.*;
import java.util.stream.Collectors;
import java.time.LocalDate;
class ProductManager {
    public List<Product> getExpensiveBooks(List<Product> products) {
        return products.stream()
                .filter(product -> "Book".equals(product.getType()) && product.getPrice() > 250)
                .collect(Collectors.toList());
    }

    public List<Product> getDiscountedBooks(List<Product> products) {
        return products.stream()
                .filter(product -> "Book".equals(product.getType()) && product.isDiscount())
                .map(product -> new Product(product.getType(), product.getPrice() * 0.9, true, product.getCreateDate()))
                .collect(Collectors.toList());
    }

    public Product findCheapestBook(List<Product> products) {
        return products.stream()
                .filter(product -> "Book".equals(product.getType()))
                .min(Comparator.comparingDouble(Product::getPrice))
                .orElseThrow(() -> new NoSuchElementException("Продукт [категорія: Book] не знайдено"));
    }

    public List<Product> getLastThreeAddedProducts(List<Product> products) {
        return products.stream()
                .sorted(Comparator.comparing(Product::getCreateDate).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    public double calculateTotalCost(List<Product> products) {
        return products.stream()
                .filter(product -> "Book".equals(product.getType()) && product.getPrice() <= 75 &&
                        product.getCreateDate().getYear() == LocalDate.now().getYear())
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public Map<String, List<Product>> groupProductsByType(List<Product> products) {
        return products.stream()
                .collect(Collectors.groupingBy(Product::getType));
    }
}

