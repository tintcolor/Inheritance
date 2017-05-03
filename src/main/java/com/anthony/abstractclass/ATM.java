package com.anthony.abstractclass;

/**
 * Created by anthonyjones on 5/2/17.
 */
public class ATM {
    ScannerInput input = new ScannerInput();
    AccountOptions accountOptions = new AccountOptions();
    AccountPuller randomAccount = new AccountPuller();
    final String currentAccountName;
    final double currentAccountBalance;
    CurrentAccountInfo currentAccountInfo = new CurrentAccountInfo();

    ATM() {
        currentAccountName = currentAccountInfo.currentAccountName;
        currentAccountBalance = currentAccountInfo.currentAccountBalance;

        System.out.println("Welcome to Anthony's Bank");
        System.out.println();
        System.out.println("Please enter your account number");

        input.in.nextLine();

        System.out.println("Welcome Back " + currentAccountName + ", please choose which account you would like to manage");

        System.out.println("1: Business Account");
        System.out.println("2: Savings Account");
        System.out.println("3: Checking Account");

        accountOptions.chooseSpecificAccount();
        new AccountManager();


    }
}
