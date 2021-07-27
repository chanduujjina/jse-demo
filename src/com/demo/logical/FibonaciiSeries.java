package com.demo.logical;
public class FibonaciiSeries {

	public static void main(String[] args) {

		
		// to print fibonacci series  0 1 1 2 3 5 8 13 21 34
           int n = 10;
           int n1 = 0;
		   int n2 = 1;
                 //System.out.print( n1+" "+n2 );
	       while(n1<n){
			System.out.print(n1);
			int n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			 

		}
         }
}	 


