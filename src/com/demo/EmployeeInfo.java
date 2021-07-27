package com.demo;

public class EmployeeInfo {

	public String getEmpType() {
		return empType;
	}

	public int getId() {
		return id;
	}

	public String getEmpName() {
		return empName;
	}

	public String getAddress() {
		return address;
	}

	public String getGender() {
		return gender;
	}

	public int getExperience() {
		return experience;
	}

	public EmployeeInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	private int id;
	
	private String empName;
	
	private String address;
	private String gender;
	
	private int experience;
	
	private String empType;
	
	public EmployeeInfo(int id, String empName, String address, String gender, int experience,String empType) {
		super();
		this.id = id;
		this.empName = empName;
		this.address = address;
		this.gender = gender;
		this.experience = experience;
		this.empType = empType;
	}

	@Override
	public String toString() {
		return "EmployeeInfo [id=" + id + ", empName=" + empName + ", address=" + address + ", gender=" + gender
				+ ", experience=" + experience + ", empType=" + empType + "]";
	}
	
	


}

