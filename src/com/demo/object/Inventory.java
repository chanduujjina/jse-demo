package com.demo.object;

public class Inventory {
	

    @Override
	public String toString() {
		return "Inventory [inventoryId=" + inventoryId + ", inventoryName=" + inventoryName + ", invntoryType="
				+ invntoryType + ", container=" + container + "]";
	}


	/**
	 * default constructor
	 */
	public Inventory() {
		
	}
	

	/**
	 * @param inventoryId
	 * Single arg constrctor
	 */
	public Inventory(int inventoryId) {
	
		this.inventoryId = inventoryId;
	}

	/**
	 * @param inventoryId
	 * @param inventoryName
	 * 2 arg constrctor
	 */
	public Inventory(int inventoryId, String inventoryName) {
		
		this.inventoryId = inventoryId;
		this.inventoryName = inventoryName;
	}
	
	/**
	 * @param inventoryId
	 * @param inventoryName
	 * @param invntoryType
	 * Parametorized constructor
	 */
	public Inventory(int inventoryId, String inventoryName, String invntoryType) {
		super();
		this.inventoryId = inventoryId;
		this.inventoryName = inventoryName;
		this.invntoryType = invntoryType;
	}
	
	public Inventory(int inventoryId, String inventoryName, String invntoryType, String container) {
		//call three arg constructor
		
		//this(inventoryId,inventoryName,invntoryType);
		
		this.inventoryId = inventoryId;
		this.inventoryName = inventoryName;
		this.invntoryType = invntoryType;
		this.container = container;
	}

	
	private int inventoryId;
	
	private String inventoryName;
	
	private String invntoryType;
	
	private String container;
	
	
	
	public int getInventoryId() {
		return inventoryId;
	}

	public String getInventoryName() {
		return inventoryName;
	}

	public String getInvntoryType() {
		return invntoryType;
	}
	
	

}
