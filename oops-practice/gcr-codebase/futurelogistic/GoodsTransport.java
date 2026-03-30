package com.bridgelabz.futurelogistic;

abstract public class GoodsTransport {
	
	protected String transportId;
	protected String transportDateIn;
	protected int transportRating;

	// constructor
	public GoodsTransport(String transportId, String transportDateIn, int transportRating) {
		this.transportId = transportId;
		this.transportDateIn = transportDateIn;
		this.transportRating = transportRating;
	}

	// Encapsulation (Getter and Setter method)
	public String getTransportId() {
		return transportId;
	}

	public void setTransportId(String transportId) {
		this.transportId = transportId;
	}

	public String getTransportDateIn() {
		return transportDateIn;
	}

	public void setTransportDateIn(String transportDateIn) {
		this.transportDateIn = transportDateIn;
	}

	public int getTransportRating() {
		return transportRating;
	}

	public void setTransportRating(int transportRating) {
		this.transportRating = transportRating;
	}
	
	// Abstraction  by creating abstract method
	public abstract String vehicalSelection();
	
	public abstract float calculateTotalCharge();
}
