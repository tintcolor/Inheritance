package com.anthony.abstractclass;

/**
 * Created by anthonyjones on 5/1/17.
 */
public abstract class Account {


    private double currentBalance;
    private double deposit;
    private double deduction;
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

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getDeduction() {
        return deduction;
    }

    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }


}
