package com.collections.votingsystem;

	import java.util.*;

	public class VotingSystem {

	    // Stores total votes for each candidate
	    static Map<String, Integer> voteCount = new HashMap<>();

	    // Maintains order in which votes were cast
	    static Map<Integer, String> voteOrder = new LinkedHashMap<>();

	    static int voteId = 1;

	    // Cast a vote
	    static void castVote(String candidate) {

	        // Update total vote count
	        voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);

	        // Store voting order
	        voteOrder.put(voteId++, candidate);
	    }

	    // Display votes in insertion order
	    static void displayVoteOrder() {
	        System.out.println("\nVote Order:");
	        for (Map.Entry<Integer, String> entry : voteOrder.entrySet()) {
	            System.out.println("Vote " + entry.getKey() + " -> " + entry.getValue());
	        }
	    }

	    // Display results in sorted order
	    static void displaySortedResults() {
	        System.out.println("\nFinal Results (Sorted by Candidate):");

	        TreeMap<String, Integer> sortedResults = new TreeMap<>(voteCount);

	        for (Map.Entry<String, Integer> entry : sortedResults.entrySet()) {
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }
	    }

	    // Display raw vote count
	    static void displayVoteCount() {
	        System.out.println("\nVote Count:");
	        for (Map.Entry<String, Integer> entry : voteCount.entrySet()) {
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }
	    }

	    public static void main(String[] args) {

	        castVote("Alice");
	        castVote("Bob");
	        castVote("Alice");
	        castVote("David");
	        castVote("Bob");

	        displayVoteOrder();
	        displayVoteCount();
	        displaySortedResults();
	    }
	
}

