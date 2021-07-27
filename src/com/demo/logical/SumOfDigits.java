package com.demo.logical;

public class SumOfDigits {

	public static void main(String[] args) {
		// finding the sum of digits of a given number
		int originalnumber=545;
		int number;
		int sum=0;
		while(originalnumber!=0) {
			number=originalnumber%10;
			sum=sum+number;
			originalnumber=originalnumber/10;
		}
		System.out.println("sum of digits is "+sum);

	}

}
