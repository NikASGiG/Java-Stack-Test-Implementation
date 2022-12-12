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
	
	private AnimalList(String info) {
		// TODO Auto-generated constructor stub
		this.info = info;
		
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
	
	
	
}
