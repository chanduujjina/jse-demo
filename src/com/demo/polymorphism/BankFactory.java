package com.demo.polymorphism;

public class BankFactory {
	
	public Bank getBank(String bankType) {
		
		if(bankType.equalsIgnoreCase("ICICI")) {
			return new ICICI();
		}
		
		else if(bankType.equalsIgnoreCase("HDFC")) {
			return new HDFC();
		}
		
		else if(bankType.equalsIgnoreCase("AXIS")) {
			return new Axis();
		}
		
		return null;
		
	}

}
