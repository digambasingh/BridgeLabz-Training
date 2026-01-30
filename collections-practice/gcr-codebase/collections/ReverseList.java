package com.collections;

import java.util.Arrays;
import java.util.List;

public class ReverseList {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		reverseList(list);
		System.out.println(list);
		
	}
	
	public static void reverseList(List<Integer> l) {
		int left = 0;
		int right = l.size();
		while(left<right) {
			int temp = l.get(left);
			l.set(left, l.get(--right));
			l.set(right, temp);
			left++;
		}
	}
}
