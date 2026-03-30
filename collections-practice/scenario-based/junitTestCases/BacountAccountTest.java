package DigambarSoftwareSolutions.PracticeOfJunit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;

public class BacountAccountTest {
	
	static int count = 1;
	@BeforeAll
	@DisplayName("Before All method")
	public static void runBeforeAllTestCase() {
		System.out.println("Testing start");
	}
	@BeforeEach
	public void runBeforeEachTestCase() {
		System.out.println("test " + count);
		count++;
	}
	
	@Test
	void depositTest() {
		BankAccount acc = new BankAccount(102, "Digambar", 1000);
		acc.deposit(1000);
		assertEquals(2000,acc.getBalance());
	}
	
	@Test
	@DisplayName("WithDraw Method")
	void withDrawTest() {
		BankAccount acc = new BankAccount(103,"RamCharan",2000);
		acc.withDraw(1000);
		assertEquals(1000,acc.getBalance());
	}
	
	@Test
	void withDraw() {
		BankAccount acc = new BankAccount(105, "Tarun", 1000);
		assertThrows(IllegalArgumentException.class,()->{
			acc.withDraw(2000);
		});
	}
	
	@Test
	void depositeNegative() {
		BankAccount acc = new BankAccount(105, "Tarun", 1000);
		
		assertThrows(IllegalArgumentException.class,()->{
			acc.deposit(-100);
		});
	}
	
}


/*
 * assertEquals();
 * assertNotEquals();
 * assertTrue();
 * assertFalse();
 * assertNull();
 * assertNotNull();
 * assertAll();
 * assertThrows();
 * asserDeosNotThrows();
 * assertSame();
 * assertNotSame();
 * assertArrayEquals();
 * 
 * 
 * 
 */