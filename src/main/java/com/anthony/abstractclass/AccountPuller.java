package com.anthony.abstractclass;

import java.util.ArrayList;

/**
 * Created by anthonyjones on 5/3/17.
 */
public class AccountPuller {

   // SavingsAccount sam = new SavingsAccount("Sam", 300.00);

    ArrayList<SavingsAccount> savingsAccounts = new ArrayList<>();

    String[] a= new String[43];

    AccountPuller() {

    }

    SavingsAccount savingsAccountList() {
        savingsAccounts.add(new SavingsAccount("Sam", 300.00));
        savingsAccounts.add(new SavingsAccount("John", 8000.00));
        savingsAccounts.add(new SavingsAccount("Tariq", 54000.00));
        savingsAccounts.add(new SavingsAccount("Leon", 20.00));
        return savingsAccounts.get(0);
    }


}
