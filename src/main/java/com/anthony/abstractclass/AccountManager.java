package com.anthony.abstractclass;


public class AccountManager {

    CurrentAccountInfo currentAccountInfo = new CurrentAccountInfo();
    BalanceComputation balanceComputation = new BalanceComputation();

    void pullCurrentSavingsAccountInformation() {
        double currentAccountBalance = currentAccountInfo.currentAccountBalance;

        System.out.println("Your current balance is $" + currentAccountBalance);
        System.out.println();
        System.out.println("Would you like to Deposit or Withdraw?");
        System.out.println("1: Deposit or 2: Withdraw?");
        balanceComputation.computeBalance();

    }
}