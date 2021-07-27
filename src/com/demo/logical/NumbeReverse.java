package com.demo.logical;

public class NumbeReverse {

	public static void main(String[] args) {
		
		int originalnumber = 545;
		
		int number =originalnumber;
		
		int reverse =0;
		while(number!=0) {
			
		int remainder =number%10;
		
		reverse =reverse*10+remainder;
		
		number = number/10;
				
		}	
		
		System.out.println("reverse nuber is "+reverse);
		
		if(reverse==originalnumber) {
			System.out.println("given number is palindrome ");
		}
		else {
			System.out.println("given number is not palindrome ");
		}

	}

}
