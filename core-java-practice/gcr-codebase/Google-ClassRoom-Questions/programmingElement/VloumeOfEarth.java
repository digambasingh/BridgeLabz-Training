package com.bridge.lab.day2;

public class VloumeOfEarth {

	public static void main(String[] args) {
		// find the vloume of earth
		// formula vloume of spare is (4/3)*pi*r^3;
		
		float radius = 6378f;
		float pi = 3.14f;
		System.out.println((4/3)*pi*(Math.pow(radius, 3)));

	}

}
