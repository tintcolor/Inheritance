package com.anthony.abstractclass;

/**
 * Created by anthonyjones on 5/2/17.
 */
public class AccountManager {
    ScannerInput funds = new ScannerInput();


    SavingsAccount sam = new SavingsAccount("Sam", 300.00);
    String depositSum = funds.in.nextLine();

    AccountManager() {
        sam.setCurrentBalance(sam.calcBalance.calcDeposit(Double.parseDouble(depositSum), sam.getCurrentBalance()));

        System.out.println("Current Balance " + sam.getCurrentBalance());

        String deductSum = funds.in.nextLine();

        sam.setCurrentBalance(sam.calcBalance.calcWithdrawal(Double.parseDouble(deductSum), sam.getCurrentBalance()));

        System.out.println("Current Balance " + sam.getCurrentBalance());
    }

    void chooseSpecificAccount(){

    }


}
