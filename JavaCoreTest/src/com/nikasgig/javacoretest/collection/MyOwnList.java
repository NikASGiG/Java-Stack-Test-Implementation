package com.nikasgig.javacoretest.collection;



public class MyOwnList <T>{
	
	private T var;

	public MyOwnList(T var) {
		//super();
		this.var = var;
	}

	@Override
	public String toString() {
		return "MyOwnList [var=" + var + "]";
	}

	public T getVar() {
		return var;
	}

	public void setVar(T var) {
		this.var = var;
	}
	
	
	
	
}
