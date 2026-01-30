package com.collections.insurancepolicymanagementsystem;

import java.time.LocalDate;
import java.util.*;

public class InsurancePolicySystem {

    static Set<Policy> hashSet = new HashSet<>();
    static Set<Policy> linkedHashSet = new LinkedHashSet<>();
    static Set<Policy> treeSet = new TreeSet<>();

    // Add policy to all sets
    static void addPolicy(Policy p) {
        hashSet.add(p);
        linkedHashSet.add(p);
        treeSet.add(p);
    }

    // Display all unique policies
    static void displayAllPolicies() {
        System.out.println("\nAll Policies:");
        for (Policy p : hashSet) {
            System.out.println(p);
        }
    }

    //  Policies expiring within 30 days
    static void policiesExpiringSoon() {
        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        System.out.println("\nPolicies expiring within 30 days:");
        for (Policy p : treeSet) {
            if (!p.expiryDate.isAfter(next30Days)) {
                System.out.println(p);
            }
        }
    }

    //  Policies by coverage type
    static void policiesByCoverage(String type) {
        System.out.println("\nPolicies with coverage: " + type);
        for (Policy p : hashSet) {
            if (p.coverageType.equalsIgnoreCase(type)) {
                System.out.println(p);
            }
        }
    }

    // Detect duplicate policy numbers
    static void findDuplicates(List<Policy> list) {
        Set<Integer> seen = new HashSet<>();
        System.out.println("\nDuplicate Policies:");
        for (Policy p : list) {
            if (!seen.add(p.policyNumber)) {
                System.out.println(p);
            }
        }
    }

    // Performance Comparison
    static void performanceTest(Set<Policy> set, String name) {
        Policy testPolicy = new Policy(
                999, "Test", LocalDate.now().plusDays(10), "Health", 5000
        );

        long start, end;

        start = System.nanoTime();
        set.add(testPolicy);
        end = System.nanoTime();
        System.out.println(name + " Add Time: " + (end - start));

        start = System.nanoTime();
        set.contains(testPolicy);
        end = System.nanoTime();
        System.out.println(name + " Search Time: " + (end - start));

        start = System.nanoTime();
        set.remove(testPolicy);
        end = System.nanoTime();
        System.out.println(name + " Remove Time: " + (end - start));
    }

    public static void main(String[] args) {

        Policy p1 = new Policy(101, "Alice",
                LocalDate.now().plusDays(20), "Health", 5000);

        Policy p2 = new Policy(102, "Bob",
                LocalDate.now().plusDays(60), "Auto", 3000);

        Policy p3 = new Policy(103, "Carol",
                LocalDate.now().plusDays(10), "Health", 4000);

        Policy p4 = new Policy(101, "Duplicate",
                LocalDate.now().plusDays(40), "Home", 6000);

        addPolicy(p1);
        addPolicy(p2);
        addPolicy(p3);
        addPolicy(p4);

        displayAllPolicies();
        policiesExpiringSoon();
        policiesByCoverage("Health");

        // Duplicate detection using List
        List<Policy> list = Arrays.asList(p1, p2, p3, p4);
        findDuplicates(list);

        // Performance comparison
        System.out.println("\nPerformance Comparison:");
        performanceTest(new HashSet<>(hashSet), "HashSet");
        performanceTest(new LinkedHashSet<>(linkedHashSet), "LinkedHashSet");
        performanceTest(new TreeSet<>(treeSet), "TreeSet");
    }
}

