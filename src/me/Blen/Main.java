package me.Blen;

import com.sun.org.apache.xpath.internal.SourceTree;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<AccountPair> arrayAccPair = new ArrayList<AccountPair>();
    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        // write your code here

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

        optionMethod();
        String createTrans = scan.nextLine();
        int i = 1;


        if (createTrans.equalsIgnoreCase("create")) {
            newMethod("create");
            optionMethod();
        } else if (createTrans.equalsIgnoreCase("transaction")) {
            do {
                System.out.println("Please enter your Account number");
                int userAccountEntry = scan.nextInt();
                scan.nextLine();

                System.out.println("Please enter your pin number");
                int userPinEntry = scan.nextInt();
                scan.nextLine();

                for (AccountPair pairEach : arrayAccPair) {


                    if (userAccountEntry == pairEach.getAccountNum() && userPinEntry == pairEach.getPin()) {
                        System.out.println("Do you want to make a withdrawal or a deposit?");
                        String choice = scan.nextLine();

                        if (choice.equalsIgnoreCase("withdrawal")) {
                            System.out.println(" You chose withdrawal");
                            System.out.println("Please enter the amount of money to withdraw");
                            double amountToWithdraw = scan.nextDouble();
                            scan.nextLine();

                            if (pairEach.getBalance() >= amountToWithdraw) {
                                double newBalance = pairEach.getBalance() - amountToWithdraw;
                                pairEach.setBalance(newBalance);
                                System.out.println("You have made a withdrawal of " + amountToWithdraw + "and your new balance is " + pairEach.getBalance());
                            } else {
                                System.out.println("You do not have enough balance in your account");
                            }
                            i=6;
                        } else if (choice.equalsIgnoreCase("deposit")) {
                            System.out.println("You chose deposit");
                            System.out.println("Please enter the amount you would like to deposit");
                            double amountToDeposit = scan.nextDouble();
                            scan.nextLine();

                            double newBalance = pairEach.getBalance() + amountToDeposit;
                            pairEach.setBalance(newBalance);
                            System.out.println("You have made a deposit of " + amountToDeposit + " your new balance is " + pairEach.getBalance());
//                            optionMethod();
                            i=6;
                            break;
                        }
                        break;

                    }

                }
            if (i <= 3) {
                System.out.println("Try again");

            } else {
                break;
            }

            i++;


            }
            while (i <= 3) ;
            if(i==6){
                optionMethod();
            }else
            System.out.println("You have been locked out of your accounts");
        }
    }

    public static void newMethod(String create) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the account number you would like to have");
        int userGivenAcc = scan.nextInt();
        scan.nextLine();

        AccountPair userPair = new AccountPair();
        userPair.setAccountNum(userGivenAcc);

        System.out.println("Please enter a four digit pin number you would like to have ");
        int userGivenPin = scan.nextInt();
        userPair.setPin(userGivenPin);

        System.out.println("Please enter your initial balance");
        double userGivenBalance = scan.nextDouble();
        userPair.setBalance(userGivenBalance);
        arrayAccPair.add(userPair);

        System.out.println("Thank you for creating an account at our bank. " + " Your account number is " +  userPair.getAccountNum() + " Your balance is " +userPair.getBalance());
    }

    public static void optionMethod(){
        System.out.println("Welcome, what do you want to do today? Create an account or perform a transaction");
    }

}


