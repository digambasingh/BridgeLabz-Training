package com.bridgelabz.streamAPI;

	import java.time.LocalDateTime;
	import java.util.*;

	public class LoggingTransaction {
	    public static void main(String[] args) {
	        List<String> transactionIds = Arrays.asList("TXN1", "TXN2");

	        transactionIds.forEach(id ->
	                System.out.println(LocalDateTime.now() +
	                        " - Transaction: " + id));
	    }
	}

