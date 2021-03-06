package com.anthony.classmanager;

public class Product {

    private double price;
    private int id;
    private int quantity;
    private String name;

    public Product(String name, double price, int id, int quantity) {
        this.price = price;
        this.id = id;
        this.quantity = quantity;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }
}
