package com.anthony.classmanager;

/**
 * Created by anthonyjones on 5/1/17.
 */
public class Main {

    public static void main(String[] args) {


        Inventory[] inventories = new Inventory[3];


        // inventories[0] = new Product(new Shampoo("Shampoo",3.43,2,65));
        //inventories[1] = new Product("Socks", 1.45, 3, 50);
        // inventories[2] = new Product("Chairs", 17.15, 4, 8);
        // inventories[0] = new Shampoo("Shampoo", 3.43, 20, 65);


        inventories[0] = new Inventory(new Shampoo("Shampoo", 3.43, 20, 65));
        Shampoo shampoo = new Shampoo("Shampoo", 3.43, 20, 65);

        // System.out.println(inventories[0]);

        System.out.println(shampoo.getPrice());

        System.out.println(inventories[0].calcProduct(shampoo));


        for (Inventory thingsWeHaveInStock : inventories) {
//            System.out.println(thingsWeHaveInStock.products.);

        }


    }
}
