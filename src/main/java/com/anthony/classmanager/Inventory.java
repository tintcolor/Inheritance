package com.anthony.classmanager;

/**
 * Created by anthonyjones on 5/1/17.
 */
public class Inventory {

    static double inventorySum;
    double finalSum;

    Product[] products;


    public double calcProduct(Shampoo products) {
        finalSum = products.getQuantity() * products.getPrice();
        return finalSum;
    }

    Inventory(Shampoo shampoo) {

        double sum = calcProduct(shampoo);

        System.out.println(sum);
        //System.out.println(finalSum);
    }
//    Inventory(){
//        products[0] = new Shampoo();
//    }


}
