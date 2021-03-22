package com.cts.finalCheck;

public abstract class Order {

	public String channel;
	public String productType;
	
	
	public abstract void productOrder();


	public String getChannel() {
		return channel;
	}


	public void setChannel(String channel) {
		this.channel = channel;
		
	}


	public String getProductType() {
		return productType;
	}


	public void setProductType(String productType) {
		this.productType = productType;
	}


	@Override
	public String toString() {
		return "Order [channel=" + channel + ", productType=" + productType + "]";
	}
	
	
}
