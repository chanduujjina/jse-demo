package com.demo.compileTimeexception;

public class Sample2 {
	
    @Override
	public String toString() {
		return "Sample2 [id=" + id + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private int id;
    
    public Sample2() {
    	
    }
	
	public Sample2(int id) {
		this.id = id;
	}

}
