package com.nikasgig.javacoretest;

public class Jack_Person extends Animal implements Person {
	
	public String name = "Jack";
	
	
	public void doEating() {
		System.out.println("I am " + name + " and I am eating");
	}
	public void doDrinking() {
		System.out.println("I am " + name + " and I am drinking");
	}
	public void doSleeping() {
		System.out.println("I am " + name + " and I am sleeping");
	}
	
	
}
