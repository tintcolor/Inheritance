package com.anthony.abstractclass;

/**
 * Created by anthonyjones on 5/1/17.
 */
public class Main {


    public static void main(String[] args) {
        ScannerInput funds = new ScannerInput();

        String depositSum = funds.in.nextLine();

        SavingsAccount sam = new SavingsAccount("Sam", 300.00);
        double a = sam.calcBalance.calcIncomingDeposit(1, 2);

        System.out.println(sam.calcBalance.calcIncomingDeposit(Double.parseDouble(depositSum), sam.getCurrentBalance()));

        String deductSum = funds.in.nextLine();

        System.out.println(sam.calcBalance.calcWithdrawal(Double.parseDouble(deductSum), sam.getCurrentBalance()));

    }


}
