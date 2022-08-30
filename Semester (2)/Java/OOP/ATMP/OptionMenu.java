package ATMP;

import java.util.Scanner;

public class OptionMenu extends Accounts {

    Scanner menuInput = new Scanner(System.in);
    int[][] accounts = new int[2][2];
    private int tries = 0;

    public void getLogin() {
        // set accoumts numbers and pins
        accounts[0][0] = 1234;
        accounts[0][1] = 1111;
        accounts[1][0] = 4321;
        accounts[1][1] = 4444;

        System.out.println("Welcome To ATM");

        // get account from user

        System.out.println("Enter Your Account Number");
        setCustomerNumber(menuInput.nextInt());

        System.out.println("Enter Your PIN Number");
        setPinNumber(menuInput.nextInt());

        // check for account and password
        while (tries < 2) {
            if (validAccount(getCustomerNumber()) && validPin(getPinNumber())) {
                getAccountType();
            } else {
                System.out.println("Invalid Accnount Or Password");
                System.out.println("Enter Your Account Number");
                setCustomerNumber(menuInput.nextInt());

                System.out.println("Enter Your PIN Number");
                setPinNumber(menuInput.nextInt());
                tries++;
            }

        }

        // what to do if wrong !!
        // hashmap and IOExptions
    }

    public boolean validAccount(int CustomerNumber) {
        boolean isValid = false;
        for (int i = 0; i < 2; i++) {
            if (this.accounts[i][0] == CustomerNumber)
                isValid = true;

        }
        return isValid;
    }

    public boolean validPin(int pin) {
        boolean isValid = false;
        for (int i = 0; i < 2; i++) {
            if (this.accounts[i][1] == pin)
                isValid = true;

        }
        return isValid;
    }

    public void getAccountType() {
        System.out.println("Select Account You Want To Access:");
        System.out.println(" Type 1 - Checking Account");
        System.out.println(" Type 2 - Saving Account");
        System.out.println(" Type 3 - Exits");

        int selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                getChecking();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("Thank You For Using ATM, \nBye");
                tries = 3;
                break;

            default:
                System.out.println("Invalid Choise");
                break;
        }
    }

    public void getChecking() {
        System.out.println("Cheking Account:");
        System.out.println(" Type 1 - View Balance");
        System.out.println(" Type 1 - Withdraw Funds");
        System.out.println(" Type 1 - Deposit Funds");
        System.out.println(" Type 4 - Exit");
        System.out.print("Choice: ");

        int selection = menuInput.nextInt();
        switch (selection) {
            case 1:
                System.out.println("Checking Account Balance: " + getCheckingBalance() + " $");
                getAccountType();
                break;
            case 2:
                getCheckingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getCheckingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank You For Using ATM, \nBye");
                tries = 3;
                break;

            default:
                System.out.println("Invalid Choice");
                break;
        }

    }

    public void getSaving() {
        System.out.println("Saving Account:");
        System.out.println(" Type 1 - View Balance");
        System.out.println(" Type 2 - Withdraw Funds");
        System.out.println(" Type 3 - Deposit Funds");
        System.out.println(" Type 4 - Exit");
        System.out.print("Choice: ");

        int selection = menuInput.nextInt();
        switch (selection) {
            case 1:
                System.out.println("Saving Account Balance: " + getSavingBalance() + " $");
                getAccountType();
                break;
            case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getSavingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank You For Using ATM, \nBye");
                tries = 3;
                break;

            default:
                System.out.println("Invalid Chiice");
                break;
        }

    }

}