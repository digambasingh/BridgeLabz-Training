package DigambarSoftwareSolutions.PracticeOfJunit;

public class UserInterface {
	
	public static void main(String[] args) {
		BankAccount a1 = new BankAccount(102,"Ram", 1000);
		BankAccount a2 = new BankAccount(103,"RamChran", 900);
		
		a1.withDraw(1000);
//		a1.withDraw(200);
		a2.withDraw(800);
		System.out.println(a2.getBalance());
		
	}
}
