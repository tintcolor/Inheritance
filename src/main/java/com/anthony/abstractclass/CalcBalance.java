package com.anthony.abstractclass;

/**
 * Created by anthonyjones on 5/1/17.
 */
public class CalcBalance {

    public double calcDeposit(double newDeposit, double originalSum) {
        return newDeposit + originalSum;
    }

    public double calcWithdrawal(double deduction, double originalSum) {

        if (deduction > originalSum) {
            System.out.println("Insufficient Funds");
            return originalSum;
        } else {
            return originalSum - deduction;
        }
    }

}
