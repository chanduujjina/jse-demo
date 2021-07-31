package com.demo.Strings;

public class Employee {
	
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

	public Employee(int id, String name, double salary, int experince) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.experince = experince;
	}

	private int id;
	
	private String name;;
	
	private double salary;
	
	private int experince;

}
