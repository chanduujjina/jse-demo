package com.demo.logical;

public class PrimeNumberDemo {
	
	public static void main(String[] args) {
	  int inputNumber =4;
	 int factorcount=0;
	  for(int i=1;i<=inputNumber;i++) {
		  
		  if(inputNumber%i==0) {
			  factorcount++	;
		  }
	  }
	  
	  if(factorcount==2) {
		  System.out.println(inputNumber+ " is prime number");
	  }
	  else {
		  System.out.println(inputNumber+ " is not a  prime number");
	  }
	}
	
	

}
