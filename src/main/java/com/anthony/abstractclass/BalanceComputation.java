package com.anthony.abstractclass;

/**
 * Created by anthonyjones on 5/3/17.
 */
public class BalanceComputation {
    ScannerInput funds = new ScannerInput();
    ScannerInput input = new ScannerInput();
    AccountPuller accountPuller = new AccountPuller();
    SavingsAccount randomAccount = accountPuller.getSavingsAccountList();


    void computeBalance() {
        String depositOrWithdrawalChoice = input.in.next();
        switch (depositOrWithdrawalChoice) {
            case "1":
                System.out.println("Please enter the amount you would like to deposit below:");
                String depositSum = funds.in.nextLine();

                randomAccount.setCurrentBalance(randomAccount.calcBalance.calcDeposit(Double.parseDouble(depositSum), randomAccount.getCurrentBalance()));

                System.out.println("Your balance is now " + randomAccount.getCurrentBalance());
                computationLoop();

                break;
            case "2":
                System.out.println("Please enter the amount you would like to withdraw below:");
                String deductSum = funds.in.nextLine();
                if (Double.parseDouble(deductSum) > randomAccount.getCurrentBalance() + 1) {
                    System.out.println("You only have " + randomAccount.getCurrentBalance() + " in your account.");
                    System.out.println("Please try again");
                } else {

                    randomAccount.setCurrentBalance(randomAccount.calcBalance.calcWithdrawal(Double.parseDouble(deductSum), randomAccount.getCurrentBalance()));

                    System.out.printf("Your balance is now $%.2f ", randomAccount.getCurrentBalance());
                }
                computationLoop();
                break;
        }
    }


    void computationLoop() {

        System.out.println("Would you like to perform another action?");

        System.out.println("Enter 1 for Yes 2 for No");

        String continueUsingAccount = input.in.next();

        if (continueUsingAccount.equals("1")) {
            System.out.println("Would you like to Deposit or Withdraw?");
            System.out.println("1: Deposit | 2: Withdraw?");

            computeBalance();
        } else if (continueUsingAccount.equals("2")) {
            System.out.println("Have a great day! Goodbye!");
            System.exit(0);
        }
    }

}
