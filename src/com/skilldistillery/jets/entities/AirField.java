package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {

	private List<Jet> jetAddition = new ArrayList<>();

	public List<Jet> populateFleet(String fileName) {
		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] jetRecord = line.split(", ");

				String type = jetRecord[0];
				String model = jetRecord[1];
				double speed = Double.parseDouble(jetRecord[2]);
				int range = Integer.parseInt(jetRecord[3]);
				long price = Long.parseLong(jetRecord[4]);

				Jet j = null;
				if (type.equals("CargoPlane")) {
					j = new CargoPlane(model, speed, range, price);
				} else if (type.equals("FighterJet")) {
					j = new FighterJet(model, speed, range, price);
				} else if (type.equals("PassengerPlane")) {
					j = new PassengerPlane(model, speed, range, price);
				}

				jetAddition.add(j);
			}

		} catch (IOException e) {
			e.printStackTrace();
			System.err.println(e);
		}

		return jetAddition;
	}

	public AirField() {
	}

	public void display() {
		for (int i = 0; i < jetAddition.size(); i++) {
			System.out.println(jetAddition.get(i));
		}

	}

	public void flyJets() {
		for (int i = 0; i < jetAddition.size(); i++) {
			jetAddition.get(i).fly();
		}
	}

	public void fastestJet() {
		double max = 0;
		int index = 0;
		for (int i = 0; i < jetAddition.size(); i++) {
			double speed = jetAddition.get(i).getSpeed();
			if (max < speed) {
				max = speed;
				index = i;
			}

		}
		System.out.println("Fastest " + jetAddition.get(index));
	}

	public void longestRange() {
		int max = 0;
		int index = 0;
		for (int i = 0; i < jetAddition.size(); i++) {
			int range = jetAddition.get(i).getRange();
			if (max < range) {
				max = range;
				index = i;
			}

		}
		System.out.println("Longest Range " + jetAddition.get(index));
	}

	public void loadCargo() {
		for (int i = 0; i < jetAddition.size(); i++) {

			if (jetAddition.get(i) instanceof CargoPlane) {
				((CargoPlane) jetAddition.get(i)).loadingCargo();
			}

		}
	}

	public void fight() {
		for (int i = 0; i < jetAddition.size(); i++) {

			if (jetAddition.get(i) instanceof FighterJet) {
				((FighterJet) jetAddition.get(i)).fight();
			}

		}
	}

	public void addingJet(String model, double speed, int range, long price) {
		Jet p = new PassengerPlane(model, speed, range, price);
		jetAddition.add(p);
	}

	public void removingJet(int choice) {
		jetAddition.remove(choice);
	}

	public void removalList() {
		System.out.println("Which Jet would you like to remove?");

		for (int i = 0; i < jetAddition.size(); i++) {
			if (jetAddition.get(i) != null) {
				System.out.println("[" + (i + 1) + "] " + jetAddition.get(i));
			}
		}
	}

}