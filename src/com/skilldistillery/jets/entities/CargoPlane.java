package com.skilldistillery.jets.entities;

public class CargoPlane extends Jet implements CargoCarrier{

	public CargoPlane() {
	}

	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void fly() {
		System.out.println(toString());
		int hours = (int) (getRange() / getSpeed());
		System.out.println("Air time until empty: " + hours + " hours");
		System.out.println();
	}

	public void loadingCargo() {
		System.out.println(this.getModel()+ " is loading Cargo!");
	}


}
