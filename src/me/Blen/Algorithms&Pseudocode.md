
#Algorithms 
Input - Pin Number 
      - Account number 
      - withdrawal or deposit amount/ number
      
Process
        1. Create an account for the user, with pin number and account number 
        2. save the pin and account number 
        3. Prompt the user 
        4. Validate the pin and the account number with the user 
            a. If the it is validated give the option to the user to either make a withdrawal or deposit 
               If withdrawal - prompt the user to input 
                  i) if the user has enough money
                    1) Subtract the value with the entered amount
                    2) Save the new amount
                  ii) if the user doesn't have enough money let they user know he/she doesn't have enough money and 
                  to make other choices
            b. If deposit - prompt the user to enter the amount 
                1) add the entered value to the current store amount in the account 
                2) save the new amount 
            c) print the balance 
        5. if it is not validated lock the user out
Output 
Result

#Pseudocode

DEFINE pinNumber as number
DEFINE account as number
DEFINE userPin
DEFINE userAccountNumber
DEFINE withdrawalAmount
DEFINE depositAmount 
DEFINE amountInAccount

# creating three accounts with account number and pin 
DB[[pin1, account1], [pin2, account2], [pin3, account3]]

# ask the user to enter his/her pin number 
PRINT "Enter the pin"
INPUT userPin 
PRINT "Enter account number"
INPUT userAccountNumber 
#check if the pin and account number are in the database 
    IF userPin is IN DB and userAccountNumber is in accountNumber
        PRINT "Enter withdrawal OR deposit"
        #if there is enough amount in the account make the withdrwal else let the user know he/she doesn't have enough amount
        IF input is withdraw
            IF withdrawalAmount <= amountInAccount
                INPUT the amount for withdrawal 
                amountInAccount = amountInAccount - withdrawalAmount
                PRINT amountInAccount 
            ELSE 
                PRINT "you don't have enough money"
        IF  input is deposit
            amountInAccount = deposit + amountInAccount 
            PRINT amountInAccount
    ELSE 
        PRINT "you are locked out of your account"
            
            