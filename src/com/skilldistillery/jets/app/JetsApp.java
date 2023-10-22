package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;

public class JetsApp {

	private AirField call = new AirField();
	private Scanner sc = new Scanner(System.in);

	public JetsApp() {
	}

	public static void main(String[] args) {
		JetsApp app = new JetsApp();
		System.out.println("Welcome to the airfield commander.");
		System.out.println("You are authorized for all options.");
		System.out.println();
		
		app.launch();

	}

	public void launch() {
		call.populateFleet(null);
		int option = 0;
		while (option != 9) {
			displayMenu();
			option = sc.nextInt();
			switch (option) {
			case 1:
				listFleet();
				break;
			case 2:
				flyAllJets();
				break;
			case 3:
				fastestJetPrint();
				break;
			case 4:
				longestRangePrint();
				break;
			case 5:
				loadAllCargo();
				break;
			case 6:
				dogFight();
				break;
			case 7:
				addJet();
				break;
			case 8:
				removeJet();
				break;
			default:
				break;
			}
		}
		System.out.println();
		System.out.println("You have exited the program.");
		System.out.println("We appreciate your help.");

	}

	public void displayMenu() {
		System.out.println("________________________________");
		System.out.println();
		System.out.println("Select an option below.");
		System.out.println("[1] List fleet");
		System.out.println("[2] Fly all jets");
		System.out.println("[3] View fastest jet");
		System.out.println("[4] View jet with longest range.");
		System.out.println("[5] Load all Cargo Jets");
		System.out.println("[6] Dogfight!");
		System.out.println("[7] Add a jet to Fleet");
		System.out.println("[8] Remove a jet from Fleet");
		System.out.println("[9] Quit");
		System.out.println("________________________________");
		System.out.print("Choice: ");

	}

	public void listFleet() {
		System.out.println();
		System.out.println("Printing Jets...");
		call.display();
	}

	public void flyAllJets() {
		System.out.println();
		System.out.println("Activating flight.");
		call.flyJets();

	}

	public void fastestJetPrint() {
		System.out.println();
		call.fastestJet();
	}

	public void longestRangePrint() {
		System.out.println();
		call.longestRange();

	}

	public void loadAllCargo() {
		System.out.println();
		call.loadCargo();
	}

	public void dogFight() {
		System.out.println();
		call.fight();
	}

	public void addJet() {
		System.out.println();
		System.out.println("Please enter new Jet info.");
		System.out.print("What is the model? :");
		String model = sc.next();
		sc.nextLine();
		System.out.print("What is the speed? :");
		double speed = sc.nextDouble();
		sc.nextLine();
		System.out.print("What is the range? :");
		int range = sc.nextInt();
		sc.nextLine();
		System.out.print("What is the price? :");
		long price = sc.nextLong();
		sc.nextLine();
		System.out.println();

		call.addingJet(model, speed, range, price);

	}

	public void removeJet() {
		System.out.println();
		call.removalList();
		int choice = sc.nextInt();
		sc.nextLine();
		choice -= 1;
		
		call.removingJet(choice);

	}

}
