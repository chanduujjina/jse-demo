package com.demo.encapsulation;

public class Att implements Carrier{
	
	

	@Override
	public String toString() {
		return "Att [network=" + network + ", dataplane=" + dataplan + "]";
	}

	private NetworkInfo network;
	
	private DataPlan dataplan;
	
	public Att(NetworkInfo network,DataPlan dataplan) {
		this.network = network;
		this.dataplan =dataplan;
	}

	@Override
	public NetworkInfo getNetWorkInfo() {
		return network;
	}

	@Override
	public DataPlan getPlan() {
		// TODO Auto-generated method stub
		return dataplan;
	}

}
