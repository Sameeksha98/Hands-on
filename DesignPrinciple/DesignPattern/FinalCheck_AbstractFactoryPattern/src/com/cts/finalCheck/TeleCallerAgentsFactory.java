package com.cts.finalCheck;

public class TeleCallerAgentsFactory extends Factory{

	@Override
	public Order getOrder(String order) {
		// TODO Auto-generated method stub
		if(order.equalsIgnoreCase("Electronics")) {
			ElectronicOrder eo = new ElectronicOrder();
			eo.setChannel("TeleCallerAgentsFactory");
			eo.setProductType("Electronics");
			return eo;
		}
		
		else if(order.equalsIgnoreCase("Furniture")) {
			FurnitureOrder fo =  new FurnitureOrder();
			fo.setChannel("TeleCallerAgentsFactory");
			fo.setProductType("Furniture");
			return fo;
		}
		
		else if(order.equalsIgnoreCase("Toys")) {
			ToysOrder to = new ToysOrder();
			to.setChannel("TeleCallerAgentsFactory");
			to.setProductType("Toys");
			return to;
		}
		return null;
	}

}
