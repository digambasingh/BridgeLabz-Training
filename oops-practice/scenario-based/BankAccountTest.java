package com.scenario;

class BankAccount {

    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = Math.max(0, initialBalance); // prevent negative starting balance
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("Withdrawal denied. Insufficient balance.");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    public double checkBalance() {
        return balance;
    }
}


public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("ACC123", 500);

        account.deposit(200);
        account.withdraw(100);
        account.withdraw(700); // overdraft attempt
        account.deposit(-50);  // invalid deposit

        System.out.println("Current Balance: " + account.checkBalance());
    }
}

