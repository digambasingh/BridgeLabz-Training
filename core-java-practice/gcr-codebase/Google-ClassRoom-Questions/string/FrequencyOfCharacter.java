package com.string;

import java.util.Scanner;

public class FrequencyOfCharacter {
	public static int[] findFreq(String text) {
		
		int[]freqArray = new int[128];
		for(int i=0;i<text.length();i++) {
			int index = text.charAt(i);
			freqArray[index]++;
		}
		int count =0;
		for(int i=0;i<128;i++) {
			if(freqArray[i]==1)count++;
		}
		return freqArray;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the text: ");
	String text = sc.nextLine().trim();
	
	int[] freqency = findFreq(text);
	for(int i=0;i<128;i++) {
		if(freqency[i]>=1) {
			System.out.println((char)i+"--> "+freqency[i]);
		}
	}
}
}
