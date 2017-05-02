package com.anthony.classmanager;

/**
 * Created by anthonyjones on 5/1/17.
 */
public class Inventory {

    static double inventorySum = 0;
    double finalSum;

    public double calcSumOfProduct(Product products) {
        finalSum = products.getQuantity() * products.getPrice();
        return finalSum;
    }

    public double totalSumOfInventory() {
        return inventorySum = inventorySum + finalSum;
    }
}
