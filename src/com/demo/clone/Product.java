package com.demo.clone;

public class Product {

	


	private int productId;
	
	private String productName;
	
	private int price;
	
	private String productType;
	
	public void setProductId(int productId) {
		this.productId = productId;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public void setProductType(String productType) {
		this.productType = productType;
	}
	
	public int getProductId() {
		return productId;
	}


	public String getProductName() {
		return productName;
	}


	public int getPrice() {
		return price;
	}


	public String getProductType() {
		return productType;
	}
	

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price
				+ ", productType=" + productType + "]";
	}

}
