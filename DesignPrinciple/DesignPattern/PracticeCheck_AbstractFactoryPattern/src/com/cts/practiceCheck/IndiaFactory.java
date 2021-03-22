package com.cts.practiceCheck;

public class IndiaFactory extends CarFactory{

public static Car buildCar(CarType type) {
		
		Car car = null;
		
		switch(type) {
			case MICRO : car = new MicroCar(Location.INDIA);
							break;
			case MINI : car = new MiniCar(Location.INDIA);
						break;		
			case LUXURY : car = new LuxuryCar(Location.INDIA);
						break;
		}
		
		return car;
		
	}

}
