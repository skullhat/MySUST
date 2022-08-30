package ATMP;

import java.util.Scanner;

public class Accounts {
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance;
    private double savingBalance;

    Scanner input = new Scanner(System.in);

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(int checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(int savingBalance) {
        this.savingBalance = savingBalance;
    }

    public double clacCheckingWithdraw(double amount) {
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }

    public double clacSavingWithdraw(double amount) {
        savingBalance = (savingBalance - amount);
        return savingBalance;
    }

    public double clacCheckingDeposit(double ammount) {
        checkingBalance += ammount;
        return checkingBalance;
    }

    public double clacSavingDeposit(double ammount) {
        savingBalance += ammount;
        return savingBalance;
    }

    public void getCheckingWithdrawInput() {
        System.out.println("Checking Account Balance: " + checkingBalance + " $");
        System.out.println("Ammount You Want to Withdraw from Checking Account: ");
        double ammount = input.nextDouble();

        if ((checkingBalance - ammount) >= 0) {
            clacCheckingWithdraw(ammount);
            System.out.println("New Checking Account Balance: " + +checkingBalance + " $");
        } else {
            System.out.println("Balance Cannot Be Negative!");
        }
    }

    public void getCheckingDepositInput() {
        System.out.println("Checking Account Balance: " + checkingBalance + " $");
        System.out.println("Ammount You Want to Deposit To Checking Account: ");
        double ammount = input.nextDouble();

        if ((checkingBalance + ammount) >= 0) {
            clacCheckingDeposit(ammount);
            System.out.println("New Checking Account Balance: " + +checkingBalance + " $");
        } else {
            System.out.println("Balance Cannot Be Negative!");
        }
    }

    public void getSavingDepositInput() {
        System.out.println("Saving Account Balance: " + savingBalance + " $");
        System.out.println("Ammount You Want to Deposit To Saving Account: ");
        double ammount = input.nextDouble();

        if ((checkingBalance + ammount) >= 0) {
            clacSavingDeposit(ammount);
            System.out.println("New Saving Account Balance: " + +checkingBalance + " $");
        } else {
            System.out.println("Balance Cannot Be Negative!");
        }
    }

    public void getSavingWithdrawInput() {
        System.out.println("Saving Account Balance: " + savingBalance + " $");
        System.out.println("Ammount You Want to Withdraw from Saving Account: ");
        double ammount = input.nextDouble();

        if ((savingBalance - ammount) >= 0) {
            clacSavingWithdraw(ammount);
            System.out.println("New Saving Account Balance: " + +savingBalance + " $");
        } else {
            System.out.println("Balance Cannot Be Negative!");
        }
    }

}
