package Homework10;

import java.time.LocalDate;

class Product {
    private String type;
    private double price;
    private boolean discount;
    private LocalDate createDate;

    public Product(String type, double price) {
        this.type = type;
        this.price = price;
        this.discount = false;
        this.createDate = LocalDate.now();
    }

    public Product(String type, double price, boolean discount) {
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.createDate = LocalDate.now();
    }

    public Product(String type, double price, boolean discount, LocalDate createDate) {
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.createDate = createDate;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean isDiscount() {
        return discount;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }
}