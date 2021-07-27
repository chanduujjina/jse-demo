package com.demo.logical;

public class factorial {

	public static void main(String[] args) {
		// factorial of a given number
		int number=6;
		int i;
		int factorial=1;
		for(i=1;i<=number;i++){
			factorial=factorial*i;	
		}
		System.out.println("Factorial of given number is "+ factorial);

	}

}
