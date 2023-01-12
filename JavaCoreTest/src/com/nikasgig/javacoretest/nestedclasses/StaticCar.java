package com.nikasgig.javacoretest.nestedclasses;

public class StaticCar {

	String color;
	int countDoor;
	double maxSpeed;
	
	Engine motor;
	
	public StaticCar(String color, int countDoor, double maxSpeed, Engine motor) {
		super();
		this.color = color;
		this.countDoor = countDoor;
		this.maxSpeed = maxSpeed;
		this.motor = motor;
	}


	@Override
	public String toString() {
		return "StaticCar [color=" + color + ", countDoor=" + countDoor + ", "
				+ "maxSpeed=" + maxSpeed + ", motor=" + motor + "]";
	}


	public static class Engine {
		
		int horsePower;

		public Engine(int horsePower) {
			super();
			this.horsePower = horsePower;
		}

		public int getHorsePower() {
			return horsePower;
		}

		public void setHorsePower(int horsePower) {
			this.horsePower = horsePower;
		}

		@Override
		public String toString() {
			return "Engine [horsePower=" + horsePower + "]";
		};
		
		
		
		
		
		
	}
	
	
	
	
	
}
