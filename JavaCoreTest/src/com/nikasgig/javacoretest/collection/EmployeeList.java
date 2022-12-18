package com.nikasgig.javacoretest.collection;

public class EmployeeList implements Comparable<EmployeeList>{

	private int id;
	private String name;
	private int salary;
	public EmployeeList(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeList [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(EmployeeList emp) {
		if (this.id == emp.id) {
			return 0;
		}
		else if (this.id > emp.id) {
			return 0;
		}
		else {
			return -1;
		}
		
	}
	
	
	
	
}
