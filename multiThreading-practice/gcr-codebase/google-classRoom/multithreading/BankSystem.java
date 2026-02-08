package com.bridgelabz.multithreading;

class BankAccount {
    int balance = 10000;

    public void withdraw(String name, int amount) {
        System.out.println("[" + name + "] Attempting " + amount);

        if (balance >= amount) {
            balance -= amount;
            System.out.println("Success: " + name +
                    " Balance: " + balance);
        } else {
            System.out.println("Failed: " + name);
        }
    }
}

class Transaction implements Runnable {
    BankAccount acc;
    String name;
    int amount;

    Transaction(BankAccount acc, String name, int amount) {
        this.acc = acc;
        this.name = name;
        this.amount = amount;
    }

    public void run() {
        acc.withdraw(name, amount);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        new Thread(new Transaction(acc,"Customer-1",3000)).start();
        new Thread(new Transaction(acc,"Customer-2",4000)).start();
        new Thread(new Transaction(acc,"Customer-3",2000)).start();
        new Thread(new Transaction(acc,"Customer-4",5000)).start();
        new Thread(new Transaction(acc,"Customer-5",1500)).start();
    }
}

