package com.bridgelab.storybasedscenario;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

abstract class Account{
	protected int accountNumber;
	protected String holderName;
	protected double balance;
	protected List<String> transactions = new ArrayList<>();
	
	// constructor 
	public Account(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
	
	public abstract double calculateInterest();
	
	public synchronized void deposit(double amount) {
        balance += amount;
        transactions.add("Deposited: " + amount);
    }
	
	public synchronized void withdraw(double amount) throws InsufficientBalanceException {
        if (balance < amount)
            throw new InsufficientBalanceException("Insufficient balance");

        balance -= amount;
        transactions.add("Withdrawn: " + amount);
    }
	
	public double getBalance() {
        return balance;
    }

    public List<String> getTransactions() {
        return transactions;
    }
}

class SavingsAccount extends Account{
	
	public SavingsAccount(int accNo, String name, double balance) {
		super(accNo,name,balance);
	}
	@Override
	public double calculateInterest() {
        return balance * 0.04; // 4% interest
    }
}

class CurrentAccount extends Account {

    public CurrentAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return 0; // No interest
    }
    
}

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

interface BankService {
    void createAccount(Account account);
    double checkBalance(int accountNumber);
    void transfer(int fromAcc, int toAcc, double amount) throws InsufficientBalanceException;
    void showTransactionHistory(int accountNumber);
}


class BankServiceImpl implements BankService {

    private Map<Integer, Account> accounts = new HashMap<>();

    @Override
    public void createAccount(Account account) {
        accounts.put(account.accountNumber, account);
    }

    @Override
    public double checkBalance(int accountNumber) {
        return accounts.get(accountNumber).getBalance();
    }

    @Override
    public synchronized void transfer(int fromAcc, int toAcc, double amount)
            throws InsufficientBalanceException {

        Account sender = accounts.get(fromAcc);
        Account receiver = accounts.get(toAcc);

        sender.withdraw(amount);
        receiver.deposit(amount);

        sender.transactions.add("Transferred " + amount + " to " + toAcc);
        receiver.transactions.add("Received " + amount + " from " + fromAcc);
    }

    @Override
    public void showTransactionHistory(int accountNumber) {
        accounts.get(accountNumber)
                .getTransactions()
                .forEach(System.out::println);
    }
}

class TransactionTask extends Thread {

    private BankService bank;
    private int from;
    private int to;
    private double amount;

    public TransactionTask(BankService bank, int from, int to, double amount) {
        this.bank = bank;
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    @Override
    public void run() {
        try {
            bank.transfer(from, to, amount);
            System.out.println("Transfer successful by " + Thread.currentThread().getName());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


public class BankingApp {
	public static void main(String[] args) {
		BankService bank = new BankServiceImpl();

        bank.createAccount(new SavingsAccount(101, "Alice", 5000));
        bank.createAccount(new CurrentAccount(102, "Bob", 3000));

        Thread t1 = new TransactionTask(bank, 101, 102, 1000);
        Thread t2 = new TransactionTask(bank, 101, 102, 2000);

        t1.start();
        t2.start();
        
        BankServiceImpl b = new BankServiceImpl();
        b.showTransactionHistory(101);
       
	}
}
