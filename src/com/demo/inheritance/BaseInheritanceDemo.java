package com.demo.inheritance;



public class BaseInheritanceDemo {

	public static void main(String[] args) {
		
		
		// create an object for child class
		
		Child1 child = new Child1(1, "child", 1, "parent");
		
		//System.out.println(child);
		
		//print parent details
		
		//System.out.println(child.getParentName());
		//System.out.println(child.getId());
		
		//create an child objectby holding with super class refrence
		
		Parent parent = new Child1(2,"child1",1,"parent");
		System.out.println(parent);
		//parent details
		System.out.println(parent.getParentName());
		
		
		
		

	}

}
