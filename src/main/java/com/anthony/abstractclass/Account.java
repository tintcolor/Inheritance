package com.anthony.abstractclass;

/**
 * Created by anthonyjones on 5/1/17.
 */
public abstract class Account {


    private double currentBalance;
    private double incomingDeposit;
    private double outgoingDeposit;
    private String accountHolderName;

    CalcBalance calcBalance = new CalcBalance();



    Account(String accountHolderName, double currentBalance, double incomingDeposit){
        this.accountHolderName = accountHolderName;
        this.currentBalance = currentBalance;
        this.incomingDeposit = incomingDeposit;
        calcBalance.calcIncomingDeposit(incomingDeposit,currentBalance);
        calcBalance.calcWithdrawal(outgoingDeposit, currentBalance);
    }


    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public double getIncomingDeposit() {
        return incomingDeposit;
    }

    public void setIncomingDeposit(double incomingDeposit) {
        this.incomingDeposit = incomingDeposit;
    }

    public double getOutgoingDeposit() {
        return outgoingDeposit;
    }

    public void setOutgoingDeposit(double outgoingDeposit) {
        this.outgoingDeposit = outgoingDeposit;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }



}
