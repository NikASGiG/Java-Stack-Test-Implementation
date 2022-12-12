package com.nikasgig.javacoretest;

public class Corgi extends Dog {

	public String sort = "corgi";
	public int id;
	public Corgi(int id) {
		
		this.id = id;
		
	}
	public Corgi() {}
	public void upStatus() {
		
		name = "Rich";
		age += 1000;
		satiety += 1000;
		energy += 1000;
		health += 1000;
		
	}
	
	public boolean equalsID(Corgi obj) {
		return this.id == obj.id;
	}
	
	
	
	
	
	
}
