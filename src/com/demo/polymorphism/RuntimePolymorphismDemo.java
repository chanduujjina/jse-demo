package com.demo.polymorphism;

public class RuntimePolymorphismDemo {

	public static void main(String[] args) {
		
		Bank bank = new Axis();
		
		float rateOfInterest = bank.getRateOfInterest();
		
		bank.m1();
		
		System.out.println(rateOfInterest);

	}

}
