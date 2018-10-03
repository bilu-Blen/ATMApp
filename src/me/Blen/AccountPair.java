package me.Blen;

public class AccountPair {
        public int accountNum= 000000;
        public int pin = 0000;
        private double balance;


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public AccountPair(int myAccount, int myPin, double myBalance) {
            this.accountNum = myAccount;
            this.pin = myPin;
            this.balance=myBalance;
        }

        public AccountPair(){

        }
        public int getAccountNum() {
            return accountNum;
        }

        public void setAccountNum(int accountNum) {
            this.accountNum = accountNum;
        }

        public int getPin() {
            return pin;
        }

        public void setPin(int pin) {
            this.pin = pin;
        }
}
