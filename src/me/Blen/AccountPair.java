package me.Blen;

public class AccountPair {
        public int accountNum= 000000;
        public int pin = 0000;
        public AccountPair(int myAccount, int myPin) {
            this.accountNum = myAccount;
            this.pin = myPin;
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
