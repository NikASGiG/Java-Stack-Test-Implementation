package com.nikasgig.javacoretest;

public class Pig extends Animal {
	public String type = "pig";
	
	

	
	public void showStatus() {
		
		// Animal Status
		System.out.println("--- " + name + " ---");
		// ---
		System.out.println("Type: " +type);
		// ---
		System.out.println("Age: " +age);
		System.out.println("Satiety: " +satiety);
		System.out.println("Energy: " +energy);
		System.out.println("Health: " +health);
		// ---------------

	}
	
}
