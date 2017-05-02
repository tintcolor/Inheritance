package com.anthony.abstractclass;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by anthonyjones on 5/1/17.
 */
public class testCalcBalance {

    @Test
    public void testCalcIncomingDeposit(){
        //given
        double newDeposit= 50.00;
        double originalSum = 100.00;
        double expectedBalance = 150.00;
        CalcBalance calcBalance = new CalcBalance();
        //when
        double actualBalance = calcBalance.calcIncomingDeposit(newDeposit,originalSum);

        //then
        Assert.assertEquals(expectedBalance,actualBalance,.0001);
    }

    @Test
    public void calcWithdrawal(){
        //given
        double deduction= 50.00;
        double originalSum = 100.00;
        double expectedBalance = 50.00;
        CalcBalance calcBalance = new CalcBalance();
        //when
        double actualBalance = calcBalance.calcWithdrawal(deduction,originalSum);

        //then
        Assert.assertEquals(expectedBalance,actualBalance,.0001);
    }
}
