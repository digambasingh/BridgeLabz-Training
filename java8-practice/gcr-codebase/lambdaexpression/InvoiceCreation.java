package com.bridgelabz.lambdaexpression;

import java.util.*;
import java.util.stream.Collectors;

class Invoice {
    String transactionId;

    Invoice(String transactionId) {
        this.transactionId = transactionId;
    }

    public String toString() {
        return "Invoice for Transaction: " + transactionId;
    }
}

public class InvoiceCreation {
    public static void main(String[] args) {

        List<String> transactions = List.of("TXN1001", "TXN1002", "TXN1003");

        List<Invoice> invoices = transactions.stream()
                .map(Invoice::new)   // Constructor reference
                .collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}

