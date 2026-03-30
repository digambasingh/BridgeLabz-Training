package DigambarSoftwareSolutions.PracticeOfJunit;

public class BankAccount extends Account {
	
	public BankAccount(int accountNo, String holderName, double balance) {
		super(accountNo,holderName,balance);
	}
	
	@Override
	public void deposit(double money) {
	 if(money<=0) {
		 throw new IllegalArgumentException("deposte must be positive");
	 }
	 setBalance(getBalance() + money);
		System.out.println("Money deposite Successfully!");

	}
	
	@Override
	public void withDraw(double money) {
		if(money<=0) {
			throw new IllegalArgumentException("withdraw must be positive");
		}
		else if(money>getBalance()) {
			throw new IllegalArgumentException("InSufficient Balance");
		}
		else {
			setBalance(getBalance()- money);
		}
		System.out.println("Money WithDraw Successfully!");
	}
}
