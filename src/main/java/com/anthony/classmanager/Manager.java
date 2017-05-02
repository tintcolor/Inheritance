package com.anthony.classmanager;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by anthonyjones on 5/2/17.
 */
public class Manager extends List {

    ArrayList<Product> productList = new ArrayList<>();
    Inventory inventory = new Inventory();
    private double totalSumOfInventory = 0;

    Manager() {
        addProductsHere();
        printProductsOnHandAndTotalSum();
    }

    void addProductsHere() {
        productList.add(new Product("Shampoo", 1.43, 3, 23));
        productList.add(new Product("Apples", 1.43, 30, 93));
        productList.add(new Product("Cat Food", 0.50, 453, 529));
    }

    void printProductsOnHandAndTotalSum() {
        for (Product listOfProducts : productList) {
            System.out.printf("You have " + listOfProducts.getQuantity() + " items of " + listOfProducts.getName() + " with the inventory id of #" + listOfProducts.getId()
                    + ". The total sum of all these products is: $%.2f\n", inventory.calcSumOfProduct(listOfProducts));
            totalSumOfInventory = inventory.totalSumOfInventory();
        }
        System.out.println("\nThe total sum of all Products is $" + totalSumOfInventory);

    }


}
