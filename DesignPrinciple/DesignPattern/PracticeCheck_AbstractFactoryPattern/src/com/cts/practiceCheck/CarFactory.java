package com.cts.practiceCheck;

public class CarFactory {

	
	public static Car buildCar(CarType type, Location location) {
		// TODO Auto-generated method stub
		
		Car car = null;
		
		switch(location) {
			case INDIA: car = IndiaFactory.buildCar(type);
						break;
			case USA: car = USAFactory.buildCar(type);
						break;
			case DEFAULT: car = DefaultFactory.buildCar(type);
							break;
		}
		
		return car;
	}

	

}
