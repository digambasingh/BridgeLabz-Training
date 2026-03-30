package com.bridgelabz.snakeandladder;

import java.util.Map;
import java.util.Random;
import java.util.HashMap;
public class SnakeAndLadder {
public static void main(String[] args) {
	
	Map<Integer,Integer> snakes = new HashMap<>();
	Map<Integer,Integer> ladders = new HashMap<>();
	
	// Snakes
	snakes.put(16, 6);
	snakes.put(49, 11);
	snakes.put(62, 19);
	snakes.put(87, 24);
	
	// Ladders
	ladders.put(2, 30);
	ladders.put(7, 14);
	ladders.put(8, 31);
	ladders.put(15, 26);
	
	int position = 0;
	Random random = new Random();
	
	System.out.println("Game Started!");
	
	while(position<100) {
		int dice = random.nextInt(6)+1;
		System.out.println("Dice rolled: "+dice);
		if(position+dice <=100) {
			position += dice;
		}
		
		if(snakes.containsKey(position)) {
			System.out.println("Snake bite! Down to "+snakes.get(position));
			position = snakes.get(position);
		}
		else if(ladders.containsKey(position)) {
			System.out.println("Ladder climb! Up to "+ladders.get(position));
			position = ladders.get(position);
		}
		
		System.out.println("Current position: "+position);
		System.out.println("----------------------------");
	}
	System.out.println("you readhed 100. \n you won Congratulations!");
}
}
