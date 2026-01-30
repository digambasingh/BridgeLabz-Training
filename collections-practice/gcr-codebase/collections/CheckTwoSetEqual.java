package com.collections;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.function.Predicate;

public class CheckTwoSetEqual {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>(Arrays.asList(7,34,1,2,3,6));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(3,2,6,7,1));
		System.out.println(checkSetAreEqual(set1, set2));
	}
	public static boolean checkSetAreEqual(Set<Integer> s1, Set<Integer> s2) {
		Predicate<Integer> p1 = i -> s1.contains(i);
		Predicate<Integer> p2 = i -> s2.contains(i);
		boolean equal = true;
		 for(int e1 : s1) {
			 if(p2.negate().test(e1)) equal = false;
		 }
		 for(int e1 : s2) {
			 if(p1.negate().test(e1)) equal = false;
		 }
		 if(!equal) return equal;
		 return true;
	}
	
	
}
