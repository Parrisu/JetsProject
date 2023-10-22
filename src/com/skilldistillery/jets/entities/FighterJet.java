package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet() {
	}

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void fly() {
		System.out.println(toString());
		int hours = (int) (getRange() / getSpeed());
		System.out.println("Air time until empty: " + hours + " hours");
		System.out.println();
	}

	public void fight() {
		System.out.println(this.getModel() + " is ready to engage!");
	}

}
