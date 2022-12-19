package com.nikasgig.javacoretest.collection;

public class MyOwnList3 <T1, T2, T3>{

	private T1 var1;
	private T2 var2;
	private T3 var3;
	public MyOwnList3(T1 var1, T2 var2, T3 var3) {
		super();
		this.var1 = var1;
		this.var2 = var2;
		this.var3 = var3;
	}
	public T1 getVar1() {
		return var1;
	}
	public void setVar1(T1 var1) {
		this.var1 = var1;
	}
	public T2 getVar2() {
		return var2;
	}
	public void setVar2(T2 var2) {
		this.var2 = var2;
	}
	public T3 getVar3() {
		return var3;
	}
	public void setVar3(T3 var3) {
		this.var3 = var3;
	}
	@Override
	public String toString() {
		return "MyOwnList3 [var1=" + var1 + ", var2=" + var2 + ", var3=" + var3 + "]";
	}
	
	
	
	
	
	
	
	
}
