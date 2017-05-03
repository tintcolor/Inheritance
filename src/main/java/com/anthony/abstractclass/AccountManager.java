package com.anthony.abstractclass;


public class AccountManager {
    ScannerInput funds = new ScannerInput();
    //AccountOptions accountingOptions = new AccountOptions();
    AccountPuller accountPuller = new AccountPuller();

    // loop through a random list of accounts


    AccountManager() {

    }

    //list everything you have in each account, get random account, and tells you what's in each account
    void listOfSavingsAccounts() {
        //System.out.println(accountPuller.savingsAccountList(2).getCurrentBalance()+" This is the number random number should be");

        SavingsAccount randomSavingsAccount = accountPuller.savingsAccountList(2);
        System.out.println(accountPuller.savingsAccountList(2).getCurrentBalance());



        System.out.println("Your current balance is " + accountPuller.savingsAccountList(1).getCurrentBalance());
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