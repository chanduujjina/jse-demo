package com.demo.logical;

public class RightAngledTriangle {

	public static void main(String[] args) {
	
		//outer for loop for row iteration
		
		for(int i=1;i<=5;i++) {
			//inner for loop for column iteration
			
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			//to move the cursor to the next
			System.out.println("");
		}

	}

}
