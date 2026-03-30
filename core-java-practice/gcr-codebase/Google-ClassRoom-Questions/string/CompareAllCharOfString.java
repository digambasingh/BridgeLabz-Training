package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class CompareAllCharOfString {
	public static char[] CharArray(String str1,char[] charArrayUserDefine) {
		for(int i=0;i<str1.length();i++) {
			charArrayUserDefine[i] = str1.charAt(i);
		}
		return charArrayUserDefine;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the String: ");
	String str1 = sc.next();
	
	char[] charArrayUserDefine  = new char[str1.length()];
	CharArray(str1,charArrayUserDefine); 
	char[] charArrayBuiltIn = str1.toCharArray();
	
	
	if(Arrays.equals(charArrayBuiltIn, charArrayUserDefine )) {
		System.out.println("Are Both equal ? true");
	}
	else System.out.println("Are Both equal ? false");
;}
}
