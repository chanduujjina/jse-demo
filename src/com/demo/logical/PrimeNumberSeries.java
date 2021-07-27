package com.demo.logical;

public class PrimeNumberSeries {

	public static void main(String[] args) {

		
		// prime numbers between 1 to 10
		
		for(int i=1;i<=10;i++) {
			int factorcount=0;
			//inner for loop
			for(int j=1;j<=i;j++) {
				 if(i%j==0) {
					  factorcount++	;
				  }
			}
			
			if(factorcount==2) {
				  System.out.println(i+ " is prime number");
			  }
			 
		}

	}

}
