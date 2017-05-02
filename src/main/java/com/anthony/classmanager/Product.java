package com.anthony.classmanager;

/**
 * Created by anthonyjones on 5/1/17.
 */
public class Product  {

    private double price;

    private int id;

    private int quantity;

    private String name;



    public Product() {

    }

    public Product(String name, double price, int id, int quantity) {
        this.price = price;
        this.id = id;
        this.quantity = quantity;
        this.name = name;
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
}
