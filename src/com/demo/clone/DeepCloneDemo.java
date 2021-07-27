package com.demo.clone;

public class DeepCloneDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		//create an object for specimen
		
		Specimen specimen = new Specimen();
		
		//set the data to the object
		
		specimen.setId(1);
		
		specimen.setName("test");
		
		specimen.setType("blood");
		specimen.setLab("dignostic center");
		
		// take separate copy of an object using deep clone
		
		//type casting
		Specimen specimen1 = (Specimen) specimen.clone();
		
		specimen1.setType("urine");
		
		System.out.println(specimen);
		System.out.println(specimen1);

	}

}
