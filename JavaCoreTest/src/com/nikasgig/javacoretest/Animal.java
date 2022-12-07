package com.nikasgig.javacoretest;

import java.util.Random;

public class Animal {
	public String name;
	public int age;
	
	public int satiety;
	public int energy;
	public int health;
	
	public String type = "";
	
	Random random = new Random();
	
	public Animal() {
		int max = 100;
		int min = 0;
		this.name = "Boba-" + Integer.toString(random.nextInt(100000 - 0 + 1) + 0);
		this.age = random.nextInt(max - min + 1) + min;
		this.satiety = random.nextInt(max - min + 1) + min;
		this.energy = random.nextInt(max - min + 1) + min;
		this.health = random.nextInt(max - min + 1) + min;
		
	}
	
	public void showStatus() {
		System.out.println("--- " + name + " ---");
		
		if(this.type != "") {
			System.out.println("Type: " +this.type);
		}
		
		System.out.println("Age: " +age);
		System.out.println("Satiety: " +satiety);
		System.out.println("Energy: " +energy);
		System.out.println("Health: " +health);
	}
	
}
