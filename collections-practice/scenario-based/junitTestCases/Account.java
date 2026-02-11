package DigambarSoftwareSolutions.PracticeOfJunit;

abstract public class Account {
	private int accountNo;
	private String holderName;
	private double balance;
	
	// constructor
	public Account(int accountNo, String holderName, double balance) {
		this.accountNo = accountNo;
		this.holderName = holderName;
		this.balance = balance;
	}
	
	// Encapsulation (Getter and Setter)
	public void setAccountNo(int no) {
		this.accountNo = no;
	}
	
	public int getAccountNo() {
		return this.accountNo;
	}
	
	public void setHolderName(String name ) {
		this.holderName = name;
	}
	
	public String getHolderName() {
		return this.holderName;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	// Abstraction 
	
	abstract void deposit(double money);
	
	abstract void withDraw(double money);
	
}
