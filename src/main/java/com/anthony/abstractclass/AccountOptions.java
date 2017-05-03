package com.anthony.abstractclass;

/**
 * Created by anthonyjones on 5/2/17.
 */
public class AccountOptions {
    ScannerInput listOfOptions = new ScannerInput();
    AccountManager accountManager = new AccountManager();

    void chooseSpecificAccount() {
        String choice = listOfOptions.in.nextLine();
        switch (choice) {
            case "1":
                System.out.println("Business Account");
                break;
            case "2":
                System.out.println("Savings Account");
                accountManager.pullCurrentSavingsAccountInformation();
                break;
            case "3":
                System.out.println("Checking Account");
                break;
            default:
                System.out.println("Please Choose an account from the List");
                chooseSpecificAccount();
                break;
        }

    }


    void depositOrWithdraw() {
        String choice = listOfOptions.in.nextLine();

        switch (choice) {
            case "1":
                System.out.println("Deposit");
                break;
            case "2":
                System.out.println("Withdraw");
                break;
            default:
                System.out.println("Please Choose an account from the List");
                chooseSpecificAccount();
                break;
        }
    }

}
