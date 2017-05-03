package com.anthony.abstractclass;


public class AccountManager {
    ScannerInput funds = new ScannerInput();
    //AccountOptions accountingOptions = new AccountOptions();
    AccountPuller randomAccount = new AccountPuller();

    // loop through a random list of accounts


    AccountManager() {

    }

    //list everything you have in each account, get random account, and tells you what's in each account
    void listOfSavingsAccounts() {


        randomAccount.savingsAccountList();

        System.out.println("Your current balance is " + sam.getCurrentBalance());
        System.out.println();
        System.out.println("Would you like to Deposit or Withdraw?");
        // accountingOptions.depositOrWithdraw();

        String depositSum = funds.in.nextLine();
        sam.setCurrentBalance(sam.calcBalance.calcDeposit(Double.parseDouble(depositSum), sam.getCurrentBalance()));

        System.out.println("Current Balance " + sam.getCurrentBalance());

        String deductSum = funds.in.nextLine();

        sam.setCurrentBalance(sam.calcBalance.calcWithdrawal(Double.parseDouble(deductSum), sam.getCurrentBalance()));

        System.out.println("Current Balance " + sam.getCurrentBalance());

    }
}