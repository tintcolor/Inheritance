package com.anthony.abstractclass;

public class SavingsAccount extends Account {




    SavingsAccount(String accountHolderName, double currentBalance) {
        super(accountHolderName, currentBalance);
        calcBalance.calcDeposit(getDeposit(), currentBalance);
        calcBalance.calcWithdrawal(getDeduction(), currentBalance);
    }


}
