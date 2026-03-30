package com.bridgelabz.futurelogistic;
import java.util.function.*;
import java.util.Scanner;

public class BrickTransport extends GoodsTransport {

	protected float brickSize;
	protected int brickQuantity;
	protected float brickPrice;
	
	// constructor
	public BrickTransport(String transportId,String transportDateIn,int transportRating,float brickSize,
			int brickQuantity,float brickPrice) {
		super(transportId,transportDateIn,transportRating);
		this.brickSize = brickSize;
		this.brickQuantity = brickQuantity;
		this.brickPrice = brickPrice;
		
	}
	
	// Encapsulation (Getter and Setter)
	public float getBrickSize() {
		return brickSize;
	}
	public void setBrickSize(float brickSize) {
		this.brickSize = brickSize;
	}
	public int getBrickQuantity() {
		return brickQuantity;
	}
	public void setBrickQuantity(int brickQuantity) {
		this.brickQuantity = brickQuantity;
	}
	public float getBrickPrice() {
		return brickPrice;
	}
	public void setBrickPrice(float brickPrice) {
		this.brickPrice = brickPrice;
	}
	
	
	@Override
	public String vehicalSelection() {
		return p.apply(getBrickQuantity());
	}
	
	@Override
	public float calculateTotalCharge() {
		float price = brickPrice * brickQuantity;
		float tax = price * 0.3f;
		float vehicalCost = switch(vehicalSelection().toLowerCase()) {
		case "truck" -> 1000;
		case "lorry" -> 1700;
		default -> 3000;
		};
		
		float discount = 0;
		if(transportRating == 5) {
			discount = price*0.2f;
		}
		else if(transportRating==3 || getTransportRating() ==4) {
			discount = price*0.1f;
		}
		return price + vehicalCost + tax  -discount;
	}
	
	Function<Integer,String> p = (i) -> {
		if(i <300) return "Truck";
		else if(i<=500) return "Lorry";
		else return "MonsterLorry";
	};
}
