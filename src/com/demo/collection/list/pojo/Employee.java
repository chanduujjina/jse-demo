package com.demo.collection.list.pojo;

public class Employee implements Comparable<Employee> {
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + "]";
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(int id, String name, String gender, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}

	private int id;
	
	private String name;
	
	private String gender;
	
	private double salary;

	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		//if current  name greater than incoming  name =1
		//if current  name less than incoming  name =-1
		//if current  name equals to incoming  name =0
		//emp.getGender().compareTo(this.gender); descending
		//return this.getGender().compareTo(emp.getGender());//asecding order
		//emp.getId()-this.id //descending order
		//return this.id-emp.getId();//asecnding order
		
		//return (int) (this.salary-emp.getSalary()); // asecding order
		
		return (int) (emp.getSalary()-this.salary);
		
		
	}

}
