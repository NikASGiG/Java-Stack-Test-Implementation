package com.nikasgig.javacoretest;
import java.util.Scanner;
// 03.12.2022
public class TestWorkWithClass {
//int a, b;
	
	Scanner in = new Scanner(System.in);
	
	
public int Sum(int a, int b) {
	return a+b;
}
int Multiply(int a, int b) {
	return a*b;
	
}
void ShowMenu() {
	System.out.println("1. Sum()");
	System.out.println("2. Multiply()");
	System.out.println("0. Exit");
}

void SumGui() {
	System.out.print("Enter first num: ");
	int firstNum = in.nextInt();
	System.out.println();
	System.out.print("Enter second num: ");
	int secondNum = in.nextInt();
	System.out.println();
	System.out.println("Sum: " + Sum(firstNum, secondNum));
	
	
	
}
void Multiply() {
	System.out.print("Enter first num: ");
	int firstNum = in.nextInt();
	System.out.println();
	System.out.print("Enter second num: ");
	int secondNum = in.nextInt();
	System.out.println();
	System.out.println("Multiply: " + Multiply(firstNum, secondNum));
	
	
	
}
void TaskMenu(int a) {
	switch (a) {
	case 1:
		SumGui();
		break;

	case 2:
		Multiply();
		break;
	case 0:
	
		break;
	default:
		break;
	}
}

private int number;
private boolean checkerNumber;

void getNumber(int n) {
	if (n < 0) {
		System.out.println("Error of getNumber()");
	} else {
				number = n;
	}
}

void getCheckerNumber(boolean n) {
	checkerNumber = n;
	
}

int setNumber() {
	return number;
}

boolean setCheckerNumber() {
	return checkerNumber;
}











}
