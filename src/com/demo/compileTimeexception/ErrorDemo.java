package com.demo.compileTimeexception;

public class ErrorDemo {
	private String errorException;
	
	public ErrorDemo(String errorException) {
		this.errorException = errorException;
	}
	
	public static void main(String[] args) {
		int i=1;
		//infinite loop will give stack overflow error
		for(;;) {
			System.out.println("inside for loop");
		}
	}

}
