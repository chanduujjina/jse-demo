package com.demo.controlStatements;

public class ControStatementsDemo {

	public static void main(String[] args) {
		
		//find whether given number is even or add
        int inputnumber =11;
        
       int remainder = inputnumber%2;
        
        if(remainder==0) {
        	System.out.println(inputnumber+" is a even number");
        }
        else {
        	System.out.println(inputnumber+" is a odd number");
        }
        
       String result = remainder==0 ? " is a even number" : " is a odd number";
       
       System.out.println(inputnumber+result);
	}

}
