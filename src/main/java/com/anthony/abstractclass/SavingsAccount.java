package com.anthony.abstractclass;

public class SavingsAccount extends Account {


    CalcBalance calcBalance = new CalcBalance();


    SavingsAccount(String accountHolderName, double currentBalance) {
        super(accountHolderName, currentBalance);
        calcBalance.calcIncomingDeposit(getDeposit(), currentBalance);
        calcBalance.calcWithdrawal(getDeduction(), currentBalance);
    }


}
