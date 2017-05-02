package com.anthony.abstractclass;

/**
 * Created by anthonyjones on 5/1/17.
 */
public class CalcBalance {

    public double calcIncomingDeposit(double newDeposit, double originalSum) {
        return newDeposit + originalSum;
    }

    public double calcWithdrawal(double deduction, double originalSum) {
        return originalSum - deduction;
    }

}
