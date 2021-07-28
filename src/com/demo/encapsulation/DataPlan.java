package com.demo.encapsulation;

public class DataPlan {
	
	public DataPlan(int planid, String planName, int planPrice) {
		super();
		this.planid = planid;
		this.planName = planName;
		this.planPrice = planPrice;
	}

	private int planid;
	
	private String planName;
	
	private int planPrice;

	@Override
	public String toString() {
		return "DataPlane [planid=" + planid + ", planName=" + planName + ", planPrice=" + planPrice + "]";
	}

}
