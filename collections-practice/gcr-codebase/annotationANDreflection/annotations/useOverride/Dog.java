package com.bridgelabz.annotations.useOverride;

public class Dog extends Animal {
	@Override
	public void makeSound() {
		System.out.println("Dog clas make sound method!");
	}
}
