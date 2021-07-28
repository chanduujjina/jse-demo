package com.demo.encapsulation;

public class NetworkInfo {
	
	@Override
	public String toString() {
		return "NetworkInfo [networkid=" + networkid + ", networkName=" + networkName + ", description=" + description
				+ ", isPortable=" + isPortable + "]";
	}

	public NetworkInfo(int networkid, String networkName, String description, boolean isPortable) {
		super();
		this.networkid = networkid;
		this.networkName = networkName;
		this.description = description;
		this.isPortable = isPortable;
	}

	private int networkid;
	
	private String networkName;
	
	private String description;
	
	private boolean isPortable;

}
