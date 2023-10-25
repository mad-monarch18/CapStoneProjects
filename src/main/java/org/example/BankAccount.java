package org.example;
import java.util.ArrayList;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("$" + amount + " has been added to your account.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void makePayment(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("You have successfully paid $" + amount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

}
