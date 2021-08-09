package com.demo.customException;

public class Employee {

	private int id;

	private String name;;

	private double salary;

	private int experince;

	private String panNumber;

	public Employee(int id, String name, double salary, int experince, String panNumber) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.experince = experince;
		this.panNumber = panNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getExperince() {
		return experince;
	}

	public void setExperince(int experince) {
		this.experince = experince;
	}
	
	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	

}
