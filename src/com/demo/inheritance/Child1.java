package com.demo.inheritance;

public class Child1 extends Parent{
	

	public int getChildId() {
		return childId;
	}


	public String getChildName() {
		return childName;
	}


	@Override
	public String toString() {
		return "Child1 [childId=" + childId + ", childName=" + childName + "]";
	}


	private int childId;
	
	private String childName;
	

	public Child1(int childId, String childName,int id,String parentName) {
		super(parentName,id);
		this.childId = childId;
		this.childName = childName;
	}
	
	
	

}
