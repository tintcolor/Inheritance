package com.anthony.abstractclass;

/**
 * Created by anthonyjones on 5/3/17.
 */
public class CurrentAccountInfo {

    final String currentAccountName;
    final double currentAccountBalance;


    AccountPuller randomAccount = new AccountPuller();

    CurrentAccountInfo(){
        currentAccountName = randomAccount.getSavingsAccountList().getAccountHolderName();
        currentAccountBalance = randomAccount.getSavingsAccountList().getCurrentBalance();

    }

}
