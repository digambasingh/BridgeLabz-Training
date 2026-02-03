package com.bridgelabz.annotations.useOverride;

public class UseOverride {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.makeSound();
		Dog d = new Dog();
		d.makeSound();
		Animal a1 = new Dog();
		a1.makeSound();
	}
}
