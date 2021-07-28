package com.demo.encapsulation;

public class Triangle implements Shape,Printable{

	@Override
	public void draw() {
		System.out.println("inside Triangle draw method");
		
	}

	@Override
	public void print() {
		
		System.out.println("inside Triangle print method");
	}

	

}
