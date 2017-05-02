package com.anthony.classmanager;

/**
 * Created by anthonyjones on 5/1/17.
 */
public class Shampoo extends Product {

    private double price;

    private int id;

    private int quantity;

    private String name;

    public Shampoo(String name, double price, int id, int quantity) {
        super(name, price, id, quantity);
    }

    public double getPrice() {
        return price;
    }

    public double getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
