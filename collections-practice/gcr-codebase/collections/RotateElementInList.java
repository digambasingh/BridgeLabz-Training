package com.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class RotateElementInList {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,20,30,40,50,60);
		System.out.println(rotateList(list, 2));
		
	}
	
	public static List<Integer> rotateList(List<Integer> l,int n) {
		int len = l.size();
		n = n%len;
		List<Integer> list = new ArrayList<>();
		for(int i=n;i<len;i++) {
			list.add(l.get(i));
		}
		for(int i=0;i<n;i++) {
			list.add(l.get(i));
		}
		return list;
	}
}
