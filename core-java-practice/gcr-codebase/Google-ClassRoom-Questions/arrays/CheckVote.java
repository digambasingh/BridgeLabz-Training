package com.Arrays;

import java.util.Scanner;

public class CheckVote {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] age = new int[10];
	for(int i=0;i<10;i++) {
		System.out.println("Enter the Age: ");
		age[i] = sc.nextInt();
	}
	for(int i=0;i<10;i++) {
		if(age[i]>=18) {
			System.out.println("The Studetn with the age "+age[i]+" can vote");
		}
		else {
			System.out.println("The Studetn with the age "+age[i]+" can not vote");
		}
	}
}
}
