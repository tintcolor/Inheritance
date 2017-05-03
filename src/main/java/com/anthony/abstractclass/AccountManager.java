package com.anthony.abstractclass;


public class AccountManager {

    AccountPuller accountPuller = new AccountPuller();
    CurrentAccountInfo currentAccountInfo = new CurrentAccountInfo();
    BalanceComputation balanceComputation = new BalanceComputation();
    // loop through a random list of accounts

    AccountManager() {

    }

    //list everything you have in each account, get random account, and tells you what's in each account
    void pullCurrentSavingsAccountInformation() {
        double currentAccountBalance = currentAccountInfo.currentAccountBalance;


        System.out.println("Your current balance is $" + currentAccountBalance);
        System.out.println();
        System.out.println("Would you like to Deposit or Withdraw?");
        System.out.println("1: Deposit or 2: Withdraw?");
        balanceComputation.computeBalance();


    }
}