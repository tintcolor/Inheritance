package com.anthony.abstractclass;

/**
 * Created by anthonyjones on 5/1/17.
 */
public abstract class Account {

    private double currentBalance;
    private String accountHolderName;

    CalcBalance calcBalance = new CalcBalance();

    Account(String accountHolderName, double currentBalance) {
        this.accountHolderName = accountHolderName;
        this.currentBalance = currentBalance;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

}
