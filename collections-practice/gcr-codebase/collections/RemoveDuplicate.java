package com.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.LinkedHashSet;

public class RemoveDuplicate {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4,3,1,2,3,3,4,5);
		System.out.println(removeDuplicate(list));
	}
	
	public static  Set<Integer> removeDuplicate(List<Integer> l) {
		Set<Integer> set = new LinkedHashSet<Integer>();
		for(int i:l) {
			set.add(i);
		}
		return set;
	}
}
