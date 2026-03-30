package com.bridgelabz.scenario;

import java.util.*;

//custom exception
class DuplicateVoteException extends Exception {
 public DuplicateVoteException(String message) {
     super(message);
 }
}

//Voter class
class Voter {
 int voterId;
 String name;
 boolean hasVoted;

 Voter(int voterId, String name) {
     this.voterId = voterId;
     this.name = name;
     this.hasVoted = false;
 }
}

//Candidate class
class Candidate {
 int candidateId;
 String name;
 int votes;

 Candidate(int candidateId, String name) {
     this.candidateId = candidateId;
     this.name = name;
     this.votes = 0;
 }
}

//Vote class
class Vote {
 Voter voter;
 Candidate candidate;

 Vote(Voter voter, Candidate candidate) {
     this.voter = voter;
     this.candidate = candidate;
 }
}

//abstraction
abstract class ElectionService {
 abstract void registerVoter(Voter voter);
 abstract void addCandidate(Candidate candidate);
 abstract void castVote(int voterId, int candidateId)
         throws DuplicateVoteException;
 abstract void showResult();
}

//implementation
class Election extends ElectionService {

 private List<Voter> voters = new ArrayList<>();
 private List<Candidate> candidates = new ArrayList<>();
 private List<Vote> votes = new ArrayList<>();

 public void registerVoter(Voter voter) {
     voters.add(voter);
     System.out.println("Voter registered: " + voter.name);
 }

 public void addCandidate(Candidate candidate) {
     candidates.add(candidate);
     System.out.println("Candidate added: " + candidate.name);
 }

 public void castVote(int voterId, int candidateId)
         throws DuplicateVoteException {

     Voter voter = null;
     Candidate candidate = null;

     for (Voter v : voters) {
         if (v.voterId == voterId) {
             voter = v;
             break;
         }
     }

     if (voter == null) {
         System.out.println("Voter not found");
         return;
     }

     if (voter.hasVoted) {
         throw new DuplicateVoteException("Voter has already voted");
     }

     for (Candidate c : candidates) {
         if (c.candidateId == candidateId) {
             candidate = c;
             break;
         }
     }

     if (candidate == null) {
         System.out.println("Candidate not found");
         return;
     }

     voter.hasVoted = true;
     candidate.votes++;
     votes.add(new Vote(voter, candidate));

     System.out.println(voter.name + " voted for " + candidate.name);
 }

 public void showResult() {
     System.out.println("---- Election Result ----");
     for (Candidate c : candidates) {
         System.out.println(c.name + " : " + c.votes + " votes");
     }
 }
}

//main class
public class OnlineVotingApp {
 public static void main(String[] args) {

     Election election = new Election();

     election.registerVoter(new Voter(1, "Digambar"));
     election.registerVoter(new Voter(2, "Rahul"));

     election.addCandidate(new Candidate(101, "Candidate A"));
     election.addCandidate(new Candidate(102, "Candidate B"));

     try {
         election.castVote(1, 101);
         election.castVote(1, 102); // duplicate vote
     } catch (DuplicateVoteException e) {
         System.out.println(e.getMessage());
     }

//     election.castVote(2, 102);

     election.showResult();
 }
}
