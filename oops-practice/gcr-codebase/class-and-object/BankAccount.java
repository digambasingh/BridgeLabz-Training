package com.bridgelabz.classandobject;

class BankAccount {
    String accountHolder;
    double balance;

    BankAccount(String holder, double balance) {
        this.accountHolder = holder;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw amount is : " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        System.out.println("State of Chennai\n");
        BankAccount acc = new BankAccount("User", 700);
        acc.displayBalance();
        acc.deposit(200);
        acc.displayBalance();
        acc.withdraw(100);
        acc.displayBalance();
        acc.withdraw(1000);
    }
}

