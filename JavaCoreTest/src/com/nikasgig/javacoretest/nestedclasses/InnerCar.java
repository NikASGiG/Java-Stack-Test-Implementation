package com.nikasgig.javacoretest.nestedclasses;



public class InnerCar {

	String color;
	int countDoor;
	double maxSpeed;
	
	Engine motor;
	
	public InnerCar(String color, int countDoor, double maxSpeed, int horsePower) {
		super();
		this.color = color;
		this.countDoor = countDoor;
		this.maxSpeed = maxSpeed;
		this.motor = this.new Engine(horsePower);
	}


	@Override
	public String toString() {
		return "InnerCar [color=" + color + ", countDoor=" + countDoor + ", "
				+ "maxSpeed=" + maxSpeed + ", motor=" + motor + "]";
	}


	public class Engine {
		
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
			return "EngineV [horsePower=" + horsePower + "]";
		};
		
	
		
	}
	

}
