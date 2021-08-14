package com.demo.collection.list.pojo;

public class Student{

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

	public int getScholorShip() {
		return scholorShip;
	}

	public void setScholorShip(int scholorShip) {
		this.scholorShip = scholorShip;
	}

	public Student(int id, String name, String gender, int scholorShip) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.scholorShip = scholorShip;
	}

	private int id;
	
	private String name;
	
	private String gender;
	
	private int scholorShip;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", scholorShip=" + scholorShip + "]";
	}

	
}
