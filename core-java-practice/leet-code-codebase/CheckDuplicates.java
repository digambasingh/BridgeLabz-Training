package com.bridge.lab.leetcode.day2;

import java.util.ArrayList;
import java.util.HashSet;

public class CheckDuplicates {

	public static void main(String[] args) {
		ArrayList<String> set = new ArrayList<>();
		set.add("Digambar");
		set.add("karan");
		set.add("Ram");
		set.add("Veer");
		set.add("Dharm");
		set.add("Digambar");
		
		HashSet<String> newSet = new HashSet<>();
		for(String str : set) {
			if(newSet.contains(str)) {
				System.out.println("Yes Duplicate are present!");
				return;
			}
			newSet.add(str);
		}
		System.out.print("Do not contains Duplicates!");
	}

}
