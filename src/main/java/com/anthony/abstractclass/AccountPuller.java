package com.anthony.abstractclass;

import java.util.ArrayList;

/**
 * Created by anthonyjones on 5/3/17.
 */
public class AccountPuller {

    // SavingsAccount sam = new SavingsAccount("Sam", 300.00);

    ArrayList<SavingsAccount> savingsAccounts = new ArrayList<>();
    boolean startup = true;
    int arrayListPosition;


    SavingsAccount savingsAccountList(int randomStaticNumber) {

        savingsAccounts.add(new SavingsAccount("Sam", 300.00));
        savingsAccounts.add(new SavingsAccount("John", 8000.00));
        savingsAccounts.add(new SavingsAccount("Tariq", 54000.00));
        savingsAccounts.add(new SavingsAccount("Leon", 25.00));

        int randomNumber = (int) Math.floor(Math.random() * 4);

        arrayListPosition = randomNumber;
        return savingsAccounts.get(randomNumber);
    }


    void getSavingsAccountList(int randomStaticNumber) {

        savingsAccounts.get(2);


        System.out.println(savingsAccounts.size() + " size of arralist");

        // System.out.println(randomNumber + " Arraylistposition");
        //startup = false;

    }


}
