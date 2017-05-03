package com.anthony.abstractclass;

import java.util.ArrayList;

/**
 * Created by anthonyjones on 5/3/17.
 */
public class AccountPuller {

    // SavingsAccount sam = new SavingsAccount("Sam", 300.00);

    static final double RANDOM = Math.floor(Math.random() * 4);//4
    ArrayList<SavingsAccount> savingsAccounts = new ArrayList<>();
    boolean startup = true;
    int arrayListPosition;

    AccountPuller() {
        savingsAccountList();
    }


    void savingsAccountList() {

        savingsAccounts.add(new SavingsAccount("Sam", 300.00));
        savingsAccounts.add(new SavingsAccount("John", 8000.00));
        savingsAccounts.add(new SavingsAccount("Tariq", 54000.00));
        savingsAccounts.add(new SavingsAccount("Leon", 25.00));
        arrayListPosition = (int) RANDOM;

    }


    SavingsAccount getSavingsAccountList() {

        savingsAccounts.get((int) RANDOM);



        return savingsAccounts.get(arrayListPosition);
    }


}
