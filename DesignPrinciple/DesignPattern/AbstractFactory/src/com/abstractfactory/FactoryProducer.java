package com.abstractfactory;

public class FactoryProducer {

	public static Factory getFactory(String typeOfFactory)
	{
		if(typeOfFactory.equalsIgnoreCase("Mercedes"))
		{
			return new MercedesFactory();
		}
		else if(typeOfFactory.equalsIgnoreCase("Audi"))
		{
			return new AudiFactory();
		}
		return null;
	}
}
