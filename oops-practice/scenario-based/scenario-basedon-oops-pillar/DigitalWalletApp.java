package com.bridgelabz.scenario;

import java.util.*;

//custom exception
class InsufficientBalanceException extends Exception {
 public InsufficientBalanceException(String message) {
     super(message);
 }
}

//User class
class User {
 int id;
 String name;

 User(int id, String name) {
     this.id = id;
     this.name = name;
 }
}

//Wallet class
class Wallet {
 User user;
 double balance;

 Wallet(User user) {
     this.user = user;
     this.balance = 0;
 }

 void addMoney(double amount) {
     balance += amount;
     System.out.println("Money added: ₹" + amount);
 }

 void withdrawMoney(double amount)
         throws InsufficientBalanceException {

     if (amount > balance) {
         throw new InsufficientBalanceException("Insufficient balance");
     }
     balance -= amount;
     System.out.println("Money withdrawn: ₹" + amount);
 }
}

//Transaction class
class Transaction {
 String type;
 double amount;

 Transaction(String type, double amount) {
     this.type = type;
     this.amount = amount;
 }
}

//transfer interface
interface TransferService {
 void transfer(Wallet from, Wallet to, double amount)
         throws InsufficientBalanceException;
}

//wallet to wallet transfer
class WalletTransfer implements TransferService {

 public void transfer(Wallet from, Wallet to, double amount)
         throws InsufficientBalanceException {

     from.withdrawMoney(amount);
     to.addMoney(amount);
     System.out.println("Wallet to wallet transfer successful");
 }
}

//bank transfer
class BankTransfer implements TransferService {

 public void transfer(Wallet from, Wallet to, double amount)
         throws InsufficientBalanceException {

     from.withdrawMoney(amount + 10); // bank charge
     to.addMoney(amount);
     System.out.println("Bank transfer successful (₹10 charge)");
 }
}

//Wallet service
class WalletService {

 List<Transaction> transactions = new ArrayList<>();

 void performTransfer(TransferService service,
                      Wallet from, Wallet to, double amount) {

     try {
         service.transfer(from, to, amount);
         transactions.add(new Transaction("Transfer", amount));
     } catch (InsufficientBalanceException e) {
         System.out.println(e.getMessage());
     }
 }

 void showTransactions() {
     System.out.println("---- Transactions ----");
     for (Transaction t : transactions) {
         System.out.println(t.type + " : ₹" + t.amount);
     }
 }
}

//main class
public class DigitalWalletApp {
 public static void main(String[] args) {

     User u1 = new User(1, "Digambar");
     User u2 = new User(2, "Rahul");

     Wallet w1 = new Wallet(u1);
     Wallet w2 = new Wallet(u2);

     w1.addMoney(1000);

     WalletService service = new WalletService();

     TransferService walletTransfer = new WalletTransfer();
     TransferService bankTransfer = new BankTransfer();

     service.performTransfer(walletTransfer, w1, w2, 300);
     service.performTransfer(bankTransfer, w1, w2, 500);

     System.out.println("Balance of " + u1.name + ": ₹" + w1.balance);
     System.out.println("Balance of " + u2.name + ": ₹" + w2.balance);

     service.showTransactions();
 }
}
