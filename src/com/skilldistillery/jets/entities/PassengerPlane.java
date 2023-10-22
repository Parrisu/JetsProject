package com.skilldistillery.jets.entities;

public class PassengerPlane extends Jet {

	public PassengerPlane() {
	}

	public PassengerPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void fly() {
		System.out.println(toString());
		int hours = (int) (getRange() / getSpeed());
		System.out.println("Air time until empty: " + hours + " hours");
		System.out.println();

	}

}
