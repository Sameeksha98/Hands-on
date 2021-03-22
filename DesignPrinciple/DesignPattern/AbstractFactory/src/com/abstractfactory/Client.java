package com.abstractfactory;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the type of car required: Mercedes or Audi");
		Scanner scanner = new Scanner(System.in);
		String typeOfFactory = scanner.next();
		Factory factory = FactoryProducer.getFactory(typeOfFactory);
		
		Headlight headlight = factory.makeHeadlight();
		headlight.getHeadlight();
		
		Tire tire = factory.makeTire();
		tire.getTire();
		
	}

}
