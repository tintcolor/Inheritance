package com.anthony.classmanager;

/**
 * Created by anthonyjones on 5/1/17.
 */
public class Inventory {

    static double inventorySum;

    Product[] products = new Product[3];
    products[0] = new Shampoo;

    public double calcShampoo(Product products) {
        double finalSum = products.getQuantity() * products.getPrice();
        return finalSum;
    }


}
