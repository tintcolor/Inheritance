package com.anthony.abstractclass;


public class AccountManager {
    ScannerInput funds = new ScannerInput();
    AccountPuller accountPuller = new AccountPuller();
    CurrentAccountInfo currentAccountInfo = new CurrentAccountInfo();
    // loop through a random list of accounts

    AccountManager() {

    }

    //list everything you have in each account, get random account, and tells you what's in each account
    void pullCurrentSavingsAccountInformation() {
        String currentAccountName = currentAccountInfo.currentAccountName;
        double currentAccountBalance = currentAccountInfo.currentAccountBalance;

        SavingsAccount randomSavingsAccount = accountPuller.getSavingsAccountList();

        System.out.println("Your current balance is " + currentAccountBalance);
        System.out.println();
        System.out.println("Would you like to Deposit or Withdraw?");
        // accountingOptions.depositOrWithdraw();

        String depositSum = funds.in.nextLine();
        randomSavingsAccount.setCurrentBalance(randomSavingsAccount.calcBalance.calcDeposit(Double.parseDouble(depositSum), randomSavingsAccount.getCurrentBalance()));

        System.out.println("Current Balance " + randomSavingsAccount.getCurrentBalance());

        String deductSum = funds.in.nextLine();

        randomSavingsAccount.setCurrentBalance(randomSavingsAccount.calcBalance.calcWithdrawal(Double.parseDouble(deductSum), randomSavingsAccount.getCurrentBalance()));

        System.out.println("Current Balance " + randomSavingsAccount.getCurrentBalance());

    }
}