package com.demo.encapsulation;

public class Verizon implements Carrier{
	
	

	@Override
	public String toString() {
		return "Verizon [network=" + network + ", dataplan=" + dataplan + "]";
	}

	public Verizon(NetworkInfo network,DataPlan dataplan) {
		super();
		this.network = network;
		this.dataplan = dataplan;
	}

	private NetworkInfo network;
	
	private DataPlan dataplan;

	@Override
	public NetworkInfo getNetWorkInfo() {
		// TODO Auto-generated method stub
		return network;
	}

	@Override
	public DataPlan getPlan() {
		// TODO Auto-generated method stub
		return dataplan;
	}

}
