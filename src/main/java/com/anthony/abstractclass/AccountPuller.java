package com.anthony.abstractclass;

import java.util.ArrayList;

/**
 * Created by anthonyjones on 5/3/17.
 */
public class AccountPuller {

    // SavingsAccount sam = new SavingsAccount("Sam", 300.00);

    static final double RANDOM = Math.floor(Math.random() * 4);//4
    ArrayList<SavingsAccount> savingsAccounts = new ArrayList<>();
    ArrayList<BusinessAccount> businessAccounts = new ArrayList<>();
    ArrayList<CheckingAccount> checkingAccounts = new ArrayList<>();
    boolean startup = true;
    int arrayListPosition;

    AccountPuller() {
        setSavingsAccountList();
        setBusinessAccountList();
        setCheckingAccountList();

    }


    void setSavingsAccountList() {
        savingsAccounts.add(new SavingsAccount("Sam", 300.41));
        savingsAccounts.add(new SavingsAccount("John", 8000.75));
        savingsAccounts.add(new SavingsAccount("Tariq", 54000.32));
        savingsAccounts.add(new SavingsAccount("Leon", 25.30));
        arrayListPosition = (int) RANDOM;
    }

    SavingsAccount getSavingsAccountList() {
        savingsAccounts.get((int) RANDOM);
        return savingsAccounts.get(arrayListPosition);
    }


    void setBusinessAccountList() {
        businessAccounts.add(new BusinessAccount("Sam", 300.32));
        businessAccounts.add(new BusinessAccount("John", 900.76));
        businessAccounts.add(new BusinessAccount("Tariq", 124310.30));
        businessAccounts.add(new BusinessAccount("Leon", 902.93));
        arrayListPosition = (int) RANDOM;
    }

    BusinessAccount getBusinessAccountList() {
        businessAccounts.get((int) RANDOM);
        return businessAccounts.get(arrayListPosition);
    }


    void setCheckingAccountList() {
        checkingAccounts.add(new CheckingAccount("Sam", 600.25));
        checkingAccounts.add(new CheckingAccount("John", 800.94));
        checkingAccounts.add(new CheckingAccount("Tariq", 2400.52));
        checkingAccounts.add(new CheckingAccount("Leon", 2500.15));
        arrayListPosition = (int) RANDOM;
    }

    CheckingAccount getCheckingAccountList() {
        savingsAccounts.get((int) RANDOM);
        return checkingAccounts.get(arrayListPosition);
    }


}
