package com.demo.inheritance;

public class Parent{
	

	public String getParentName() {
		return parentName;
	}

	public int getId() {
		return id;
	}


	private String parentName;
	
	private int id;
	
	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Parent(String parentName, int id) {
		super();
		this.parentName = parentName;
		this.id = id;
	}
	
	
	@Override
	public String toString() {
		return "Parent [parentName=" + parentName + ", id=" + id + "]";
	}

}
