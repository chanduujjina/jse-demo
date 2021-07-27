package com.demo.hasrelation;

public class HasRelationShipDemo {

	public static void main(String[] args) {
		
		
		//create dependent object erddy
		
		Address address = new Address("1-112", "madhuban", "hyderabad", "ranga", "500077");
		
		
		//create an object for ITEmployee
		
		
		ITEmployee employee = new ITEmployee(1,"Sai",address);
		
		System.out.println(employee);
		

	}

}
