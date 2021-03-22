package com.cts.finalCheck;

public class FactoryProducer{

	public static Factory getChannel(String channelType) {
		if(channelType.equals("ECommerce")) {
			return new ECommerceFactory();
		}
		else if(channelType.equals("TeleCallerAgentsFactory"))
		{
			return new TeleCallerAgentsFactory();
		}
		return null;
		
		
	}

	
}
