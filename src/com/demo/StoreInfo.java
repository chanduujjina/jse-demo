package com.demo;

import java.util.List;

public class StoreInfo {
	
	

	public String getGtin() {
		return gtin;
	}

	public List<Integer> getStorenumber() {
		return storenumber;
	}

	public StoreInfo(String gtin, List<Integer> storenumber) {
		super();
		this.gtin = gtin;
		this.storenumber = storenumber;
	}

	private String gtin;
	
	private List<Integer> storenumber;

}
