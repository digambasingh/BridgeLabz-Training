package com.bridgelabz.futurelogistic;

import java.util.function.BiFunction;
import java.util.Scanner;

public class TimberTransport extends GoodsTransport {
	protected float timberLength;
	protected float timberRadius;
	protected String timberType;
	protected float timberPrice;
	// Constructor
	public TimberTransport(String transportId,String transportDateIn,int transportRating,float timberLength,
			float timberRadius,String timberType,float timberPrice) {
		super(transportId,transportDateIn,transportRating);
		this.timberLength = timberLength;
		this.timberRadius = timberRadius;
		this.timberType = timberType;
		this.timberPrice = timberPrice;
	}

	// Encapsulation (Getter and Setter)
	public float getTimberLength() {
		return timberLength;
	}

	public void setTimberLength(float timberLength) {
		this.timberLength = timberLength;
	}

	public float getTimberRadius() {
		return timberRadius;
	}

	public void setTimberRadius(float timberRadius) {
		this.timberRadius = timberRadius;
	}

	public String getTimberType() {
		return timberType;
	}

	public void setTimberType(String timberType) {
		timberType = timberType;
	}

	public float getTimberPrice() {
		return timberPrice;
	}

	public void setTimberPrice(float timberPrice) {
		this.timberPrice = timberPrice;
	}
	
	@Override
	public String vehicalSelection() {
		return p.apply(timberLength,timberRadius);
	}
	
	@Override
	public float calculateTotalCharge() {
		float volume = 3.147f * timberLength * timberRadius*timberRadius;
		
		float rate = timberType.equalsIgnoreCase("Premium") ?0.25f : 0.15f;
		
		float price =volume * timberPrice * rate;
		float tax = price*0.3f;
		float vehicalCost = switch(vehicalSelection().toLowerCase()) {
		case "truck" -> 1000;
		case "lorry" -> 1700;
		default -> 3000;
		};
		
		float discount = 0;
		
		if(transportRating ==5) {
			discount = price*0.2f;
		}
		else if(transportRating==3 || transportRating ==4) {
			discount = price*0.1f;
		}
		return price + vehicalCost + tax - discount;
	}
	
	BiFunction<Float	,Float,String> p = (i,j) -> {
		float area = (2*3.147f*i*j);
		if(area < 250) return "Truck";
		else if(area <= 400) return "Lorry";
		else return "MonsterLorry";
	};
}
