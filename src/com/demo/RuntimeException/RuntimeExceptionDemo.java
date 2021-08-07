package com.demo.RuntimeException;

public class RuntimeExceptionDemo {
	
	public  void compute(int index,String value,int firstNunber,int secondNumber) {
		
	//create an array of integers
		
		int [] numberList = new int[] {1,2,3,4,5,6,7,8,9};
		int number =0;
		
		//String value = "123";
		
		int numberValue = 0;
		int result =0;
		
		//fetch the element from 9th index
		try {
		 number = numberList[index];
		 //convert String to integer
		 numberValue = Integer.parseInt(value);
		 
		 //arithematic operation
		  result = firstNunber/secondNumber;
		 
		}catch(ArrayIndexOutOfBoundsException ex) {
			//ex.printStackTrace();
			System.out.println("there is no elements at requested index");
		}
		catch(NumberFormatException nfex) {
			//nfex.printStackTrace();
			System.out.println("cannot convert to String");
		}
		catch(ArithmeticException aex) {
			//aex.printStackTrace();
			System.out.println("one by zero gives infinite value");
		}
		
		System.out.println(number);
		System.out.println(numberValue);
		System.out.println(result);
		
	
	}

}
