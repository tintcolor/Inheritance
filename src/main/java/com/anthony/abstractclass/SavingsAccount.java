package com.anthony.abstractclass;


public class SavingsAccount extends Account {

    private double currentBalance;
    private double incomingDeposit;
    private double outgoingDeposit;
    private String accountHolderName;

    CalcBalance calcBalance = new CalcBalance();


    SavingsAccount(String accountHolderName, double currentBalance, double incomingDeposit) {
        super(accountHolderName, currentBalance, incomingDeposit);
        calcBalance.calcIncomingDeposit(incomingDeposit,currentBalance);
        calcBalance.calcWithdrawal(outgoingDeposit, currentBalance);
    }



   // calcBalance.calcIncomingDeposit();



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
