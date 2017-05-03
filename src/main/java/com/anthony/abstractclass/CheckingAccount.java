package com.anthony.abstractclass;

/**
 * Created by anthonyjones on 5/1/17.
 */
public class CheckingAccount extends Account{


    private double currentBalance;
    private double incomingDeposit;
    private double outgoingDeposit;
    private String accountHolderName;

    CheckingAccount(String accountHolderName, double currentBalance) {
        super(accountHolderName, currentBalance);
    }


    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

//    public double getIncomingDeposit() {
//        return incomingDeposit;
//    }
//
//    public void setIncomingDeposit(double incomingDeposit) {
//        this.incomingDeposit = incomingDeposit;
//    }
//
//    public double getOutgoingDeposit() {
//        return outgoingDeposit;
//    }
//
//    public void setOutgoingDeposit(double outgoingDeposit) {
//        this.outgoingDeposit = outgoingDeposit;
//    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

}
