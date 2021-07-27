package com.demo.clone;

public class Specimen implements Cloneable{
	
	

	
	private int id;
	private String name;
	
	private String type;
	
	private String lab;
	
	
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLab() {
		return lab;
	}

	public void setLab(String lab) {
		this.lab = lab;
	}
	
	@Override
	public String toString() {
		return "Specimen [id=" + id + ", name=" + name + ", type=" + type + ", lab=" + lab + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

	
	

}


