package com.anthony.abstractclass;

/**
 * Created by anthonyjones on 5/2/17.
 */
public class ATM {
    ScannerInput input = new ScannerInput();

    ATM(){

        System.out.println("Welcome to Anthony's Bank");
        System.out.println();
        System.out.println("Please enter your account number");

        input.in.nextLine();

        System.out.println("Welcome Back Sam, please choose which account you would like to view");

        System.out.println("1: Business Account");
        System.out.println("2: Savings Account");
        System.out.println("3: Checking Account");




    }
}
