package com.demo.arrays;

public class ArrayHandler {

	public static void main(String[] args) {
		
		//static way of creating an array
		//option1
		int numbers [] = {1,2,3,5,8,9};
		//in the form of object
		int numberList [] = new int[] {1,2,3,5,8,9};
		
		//dynamic way of creating an array
		
		int numberList1 [] = new  int[10];
		
		//how to insert data into an array dynamically
		
		for(int i =0;i<numberList1.length;i++) {
			numberList1[i]=i;
		}
		//update the element from specfic index
		numberList1[0]=10;
		//how to fetch/iterate the elements from the list
		
		for(int j=0;j<numberList1.length;j++) {
			System.out.print(" "+numberList1[j]);
		}
		
		

	}

}
