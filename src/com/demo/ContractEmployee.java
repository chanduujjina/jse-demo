package com.demo;

public class ContractEmployee extends EmployeeInfo{
	
	private String payrollName;
	
	private String contractDuration;
	
	

	public ContractEmployee(String payrollName, String contractDuration,int id, String empName, String address, String gender, int experience,String empType) {
		super(id,empName,address,gender,experience,empType);
		this.payrollName = payrollName;
		this.contractDuration = contractDuration;
	}
	
	@Override
	public String toString() {
		return "ContractEmployee [payrollName=" + payrollName + ", contractDuration=" + contractDuration + "]";
	}



}
