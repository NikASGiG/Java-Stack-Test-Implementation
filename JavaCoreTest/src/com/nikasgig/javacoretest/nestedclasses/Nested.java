package com.nikasgig.javacoretest.nestedclasses;

public class Nested {

	public void main() {
		
		System.out.println("Nested Classes");
		System.out.println("----------------------");
		System.out.println("Static Class");
		StaticCar.Engine motor = new StaticCar.Engine(120);
		StaticCar car1 = new StaticCar("black", 4, 300, motor);
		System.out.println(car1);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
