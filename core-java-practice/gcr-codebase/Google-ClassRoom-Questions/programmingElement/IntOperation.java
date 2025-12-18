package com.bridge.lab.day2.level2;

public class IntOperation {

	public static void main(String[] args) {
		// Write an IntOperation program by taking a, b, and c as input values and print the following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also understand the precedence of the operators. 
//		Create variables a, b, and c of int data type.
//		Take user input for a, b, and c.
//		Compute 3 integer operations and assign the result to a variable
//		Finally, print the result and try to understand operator precedence.
  
		int a = 20;
		int b = 10;
		int c = 30;
		int op1 = a+b*c;
		int op2 = a*b+c;
		int op3 = c+a/b;
		int op4 = a%b+c;
		System.out.println("The operation1: "+op1+" Operation2: "+op2+ " Opeariotn3: "+op3+" Opeariotn4: "+op4);
	}

}
