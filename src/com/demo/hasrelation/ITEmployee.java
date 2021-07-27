package com.demo.hasrelation;

public class ITEmployee {
	
	@Override
	public String toString() {
		return "ITEmployee [eid=" + eid + ", empName=" + empName + ", address=" + address + "]";
	}


	public ITEmployee(int eid, String empName, Address address) {
		super();
		this.eid = eid;
		this.empName = empName;
		this.address = address;
	}


	private int eid;
	
	private String empName;
	
	
	//has a relation
	private Address address;

}
