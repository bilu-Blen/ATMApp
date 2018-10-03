package me.Blen;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here


        ArrayList<AccountPair> arrayAccPair = new ArrayList<AccountPair>();
        AccountPair pair = new AccountPair();

        pair.setAccountNum(123456);
        pair.setPin(9875);
        pair.setBalance(500);
        arrayAccPair.add(pair);

        AccountPair pairTwo = new AccountPair();
        pairTwo.setAccountNum(987654);
        pairTwo.setPin(9876);
        pairTwo.setBalance(1000);
        arrayAccPair.add(pairTwo);

        AccountPair pairThree = new AccountPair();
        pairThree.setAccountNum(123487);
        pairThree.setPin(2210);
        pairThree.setBalance(200);
        arrayAccPair.add(pairThree);

        for (AccountPair pairEach : arrayAccPair) {
            System.out.println("Please enter your Account number");
            Scanner scan = new Scanner(System.in);
            int userAccountEntry = scan.nextInt();
            scan.nextLine();

            System.out.println("Please enter your pin number");
            int userPinEntry = scan.nextInt();
            scan.nextLine();

            if (userAccountEntry == pairEach.getAccountNum() && userPinEntry == pairEach.getPin()) {
                System.out.println("Do you want to make a withdrawal or a deposit?");
                String choice = scan.nextLine();

                if (choice.equalsIgnoreCase("withdrawal")) {
                    System.out.println(" You chose withdrawal");
                    System.out.println("Please enter the amount of money to withdraw");
                    double amountToWithdraw = scan.nextDouble();
                    scan.nextLine();

                    if(pairEach.getBalance()>= amountToWithdraw){
                        double newBalance = pairEach.getBalance() - amountToWithdraw;
                        pairEach.setBalance(newBalance);
                        System.out.println("You have made a withdrawal of " + amountToWithdraw + "and your new balance is " + pairEach.getBalance());
                    }else{
                        System.out.println("You do not have enough balance in your account");
                    }
                }else if(choice.equalsIgnoreCase("deposit")){
                    System.out.println("You chose deposit");
                    System.out.println("Please enter the amount you would like to deposit");
                    double amountToDeposit = scan.nextDouble();
                    scan.nextLine();

                    double newBalance = pairEach.getBalance() + amountToDeposit;
                    pairEach.setBalance(newBalance);
                    System.out.println("You have made a deposit of " + amountToDeposit + " your new balance is " + pairEach.getBalance());
                }
            }else if(userAccountEntry != pairEach.getAccountNum() || userPinEntry != pairEach.getPin()){

            }
        }
    }
}


