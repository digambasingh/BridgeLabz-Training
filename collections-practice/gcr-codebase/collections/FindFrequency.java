package com.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
public class FindFrequency {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Apple","Banana","Mango","Papaya","Cherry","Apple","Mango");
		System.out.println(frequencyCount(list));
	}
	
	public static Map<String,Integer> frequencyCount(List<String> l) {
		Map<String,Integer> map = new HashMap<>();
		for(String s:l) {
			if(map.containsKey(s)) {
				map.put(s, map.getOrDefault(s, 0)+1);
			}
			else {
				map.put(s, 1);
			}
		}
		return map;
	}
}
