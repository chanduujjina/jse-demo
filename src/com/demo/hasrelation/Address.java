package com.demo.hasrelation;

public class Address {

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", pincode=" + pincode + "]";
	}

	public Address(String houseNo, String street, String city, String state, String pincode) {
		super();
		this.houseNo = houseNo;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	private String houseNo;
	private String street;
	private String city;
	
	private String state;
	
	private String pincode;
}
