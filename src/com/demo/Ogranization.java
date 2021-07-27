package com.demo;

import java.util.List;

public class Ogranization {
	
	private String organizationName;
	private String address;
	
	private List<EmployeeInfo> employeeInfo;
	
	public Ogranization(String organizationName, String address, List<EmployeeInfo> employeeInfo) {
		super();
		this.organizationName = organizationName;
		this.address = address;
		this.employeeInfo = employeeInfo;
	}
	

	public String getOrganizationName() {
		return organizationName;
	}

	public String getAddress() {
		return address;
	}

	public List<EmployeeInfo> getEmployeeInfo() {
		return employeeInfo;
	}

	@Override
	public String toString() {
		return "Ogranization [organizationName=" + organizationName + ", address=" + address + ", employeeInfo="
				+ employeeInfo + "]";
	}

	



}
