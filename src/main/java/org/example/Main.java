package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> deposits = new ArrayList<>();
        ArrayList<Double> payments = new ArrayList<>();
        BankAccount customerAccount = new BankAccount(0);

        while (true) {
            System.out.println("Welcome to your online banking");
            System.out.println("(1) Make a Deposit");
            System.out.println("(2) Make a Payment");
            System.out.println("(3) View Account");
            System.out.println("(4) Exit");


            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            scanner.nextLine();


            switch (option) {
                case 1 -> {
                    System.out.println("Enter the amount you want to deposit.");
                    double deposit = scanner.nextDouble();
                    scanner.nextLine();
                    customerAccount.deposit(deposit);
                    deposits.add(deposit);
                    System.out.println("Your new balance is: $"+customerAccount.getBalance());
                }
                case 2 -> {
                    System.out.println("Enter the amount you would like to pay.");
                    double payment = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println(customerAccount.getBalance());
                    customerAccount.makePayment(payment);
                    payments.add(payment);
                    System.out.println("Your new balance is: $"+customerAccount.getBalance());
                }
                case 3 -> {
                    System.out.println("Your Account Information");
                    System.out.println("Current Balance: $" + customerAccount.getBalance());
                    System.out.println("(A)All Transactions (D)Deposits (P)Payments (R)Reports (H)Home");
                    String ledgerView = scanner.nextLine().toUpperCase();
                    if (ledgerView.equals("D")) {
                        System.out.println("Your Deposits: ");
                        System.out.println(deposits+"n");
                    }

                    else if (ledgerView.equals("A")) {
                        System.out.println("All transactions");
                        System.out.println("Deposits:");
                        for (double dep : deposits) {
                            System.out.println(dep);
                        }
                        System.out.println("Payments:");
                        for (double pay : payments) {
                            System.out.println(pay);
                        }
                    }

                    else if (ledgerView.equals("P")) {
                        System.out.println("Your Payments: ");
                        System.out.println(payments);
                    }

                    else if (ledgerView.equals("R")) {
                        System.out.println("Your Reports");
                    }

                    else if (ledgerView.equals("H")) {
                        return;
                    }

                    else {
                        System.out.println("Invalid Input");
                        return;
                    }
                }
                case 4 -> {
                    System.out.println("Goodbye for now.");
                    return;
                }
            }
        }




    }
}