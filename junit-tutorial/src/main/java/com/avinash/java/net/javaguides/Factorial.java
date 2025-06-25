package com.avinash.java.net.javaguides;

public class Factorial {

	public int factorial(int number) {
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		return fact;
	}
}
