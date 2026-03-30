package com.string;

import java.util.Scanner;

public class FirstNonRepeatingChar {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the Text: ");
	String text = sc.nextLine();
	
	char[] uniqChar = findFirstNonRepeatingChar(text);
	System.out.println("Unique character are:-");
	for(char c:uniqChar) {
		System.out.print(c+" ");
	}
		
}

public static char[] findFirstNonRepeatingChar(String text) {
	
	int[]freqArray = new int[128];
	for(int i=0;i<text.length();i++) {
		int index = text.charAt(i);
		freqArray[index]++;
	}
	int count =0;
	for(int i=0;i<128;i++) {
		if(freqArray[i]==1)count++;
	}
	char[] feqUniqChar = new char[count];
	int j=0;
	for(int i=0;i<128;i++) {
		if(freqArray[i]==1)
			feqUniqChar[j++] = (char)i;
	}
	return feqUniqChar;
}


}
