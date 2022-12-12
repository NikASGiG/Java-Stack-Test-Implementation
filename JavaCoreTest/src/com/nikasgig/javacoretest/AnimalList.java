package com.nikasgig.javacoretest;

public enum AnimalList {
	DOG("it is an animal"), 
	CAT("it is an animal"), 
	COW("it is an animal"), 
	PIG("it is an animal"), 
	FROG("it is not an animal"), 
	LION("it is an animal"),
	
	
	
	FISH("it is not an animal");
	
	
	///////////
	
	private String info;
	public static int length;
	
	private AnimalList(String info) {
		// TODO Auto-generated constructor stub
		this.info = info;
		
		
	}

	private AnimalList() {}
	
	
	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public static int getLength() {
		return length;
	}

	
	
	
	
	
}
