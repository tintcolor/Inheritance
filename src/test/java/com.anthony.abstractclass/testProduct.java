package com.anthony.abstractclass;

import com.anthony.classmanager.Inventory;
import com.anthony.classmanager.Product;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by anthonyjones on 5/1/17.
 */
public class testProduct {


    @Test
    public void testCalcSumOfProduct() {
        //given
        Product randomProduct = new Product("Shampoo", 4.54, 1, 5);
        double expectedSum = 22.70;
        Inventory inventory = new Inventory();
       // inventory.calcProduct(randomProduct);

        //when
        double actualSum = inventory.calcSumOfProduct(randomProduct);

        //then
        Assert.assertEquals(expectedSum, actualSum, .001);
    }
}
