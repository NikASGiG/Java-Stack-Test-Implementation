package com.nikasgig.javacoretest;


public class Dog extends Animal {

	
	public String type = "dog";
	//super.type = "dog";
	
	public void waitCommand() {
		System.out.println("I am "+ type + " " + name + ", and I am wait command");
	}
	
	public void doHunting() {
		System.out.println("I am "+ type + " " + name + ", go to hunting");
	}
	
	
	
}
