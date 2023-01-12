package com.nikasgig.javacoretest.nestedclasses;



public class AnonymousClass {

	Math m = new Math(){
		@Override
		public int doDo(int a, int b) {
			
			return a+b;
			
		}
		
	};
	
	
	Math m2 = new Math(){
		
		@Override
		public int doDo(int a, int b) {
			
			return a-b;
			
		}
		
	};
	

}

interface Math{
	int doDo(int a, int b);
}