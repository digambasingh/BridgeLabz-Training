package com.string;

import java.util.Scanner;

public class CompareStrChartAt {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the first String: ");
	String str1 = sc.nextLine();
	System.out.print("Enter the second String: ");
	String str2 = sc.nextLine();
	
	int lengthStr1 = str1.length();
	int lengthStr2 = str2.length();
	
	boolean compareCharAt = true;
	
	if(lengthStr1 !=lengthStr2)
		compareCharAt = false;
	
	if(lengthStr1 == lengthStr2) {
		for(int i=0;i<lengthStr1;i++) {
			if(str1.charAt(i)!=str2.charAt(i)) {
				compareCharAt = false;
				break;
			}
		}
	}
	
	System.out.println("String are compare with charAt -> both string are equal ; "+compareCharAt);
	
   System.out.println("String are compare by using equals method -> both string are equal ; "+str1.equals(str2));

}
}
