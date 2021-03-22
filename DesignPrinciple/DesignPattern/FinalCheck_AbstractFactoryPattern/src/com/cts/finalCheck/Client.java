package com.cts.finalCheck;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factory factory1 = FactoryProducer.getChannel("ECommerce");
		
		Order order1 = factory1.getOrder("Electronics");
		order1.productOrder();
		System.out.println("Channel:" +order1.getChannel());
		System.out.println("------------------------------");
		
		Order order2 = factory1.getOrder("Toys");
		order1.productOrder();
		System.out.println("Channel:" +order1.getChannel());
		System.out.println("------------------------------");
		
		Factory factory2 = FactoryProducer.getChannel("TeleCallerAgentsFactory");
		
		Order order3 = factory2.getOrder("Furniture");
		order1.productOrder();
		System.out.println("Channel:" +order3.getChannel());
		System.out.println("------------------------------");
		
		Order order4 = factory2.getOrder("Toys");
		order4.productOrder();
		System.out.println("Channel:" +order4.getChannel());
		System.out.println("------------------------------");
	}

}
