package com.anthony.classmanager;

/**
 * Created by anthonyjones on 5/1/17.
 */
public class Main {

    public static void main(String[] args) {


        Inventory[] inventories = new Inventory[3];

        inventories[0] = new Product("Shampoo",3.45, 2, 5);
        inventories[1] = new Product("Socks",1.45, 3, 50);
        inventories[2] = new Product("Chairs",17.15, 4, 8);


        for(Inventory thingsWeHaveInStock: inventories){

            System.out.println(thingsWeHaveInStock.products.);

        }


    }
}
