package me.Blen;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Please enter your Account number");
        Scanner scan = new Scanner(System.in);
        int userAccountEntry = scan.nextInt();
        scan.nextLine();

        System.out.println("Please enter your pin number");
        int userPinEntry = scan.nextInt();
        scan.nextLine();

        ArrayList<AccountPair> arrayAccPair = new ArrayList<AccountPair>();
        AccountPair pair = new AccountPair();

        pair.setAccountNum(123456);
        pair.setPin(9875);
        arrayAccPair.add(pair);

        AccountPair pairTwo = new AccountPair();
        pairTwo.setAccountNum(987654);
        pairTwo.setPin(9876);
        arrayAccPair.add(pairTwo);

        AccountPair pairThree = new AccountPair();
        pairThree.setAccountNum(123487);
        pairThree.setPin(2210);
        arrayAccPair.add(pairThree);
        System.out.println(pair.getPin());

        for (AccountPair pairEach : arrayAccPair) {
            System.out.println(pairEach.getPin());
            if (userAccountEntry == pairEach.getAccountNum() && userPinEntry == pairEach.getPin()) {
                System.out.println("Do you want to make a withdrawal or a deposit?");
                String choice = scan.nextLine();

                if (choice.equalsIgnoreCase("withdrawal")) {
                    System.out.println(" You chose withdrawal");
                }
            }
        }
    }
}


