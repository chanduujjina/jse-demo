package com.demo.polymorphism;

public class Methodoverloading {
	
   public int m1(int num1,int num2) {
		return num1+num2;
	}
	
	/*public long m1(long num1,int num2) {
		return num1+num2;
	}
	
	public long m1(int num1,long num2) {
		return num1+num2;
	}*/


	
	public long m1(long num1,long num2) {
		return num1+num2;
	}
	
	public double m1(double num1,double num2) {
		return num1+num2;
	}
	
	public int m1(String value) {
		return Integer.parseInt(value);
	}
    
    
	public static void main(String[] args) {
		Methodoverloading methodoverloading = new Methodoverloading();
		
		double result1 = methodoverloading.m1(1, 2);
		System.out.println(result1);
		
		int result2 =methodoverloading.m1("123");
		
		System.out.println(result2);
		
		

	}

}
