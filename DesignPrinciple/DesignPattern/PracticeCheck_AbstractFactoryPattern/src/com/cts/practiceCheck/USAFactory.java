package com.cts.practiceCheck;

public class USAFactory extends CarFactory{

	public static Car buildCar(CarType type) {
		
		Car car = null;
		
		switch(type) {
			case MICRO : car = new MicroCar(Location.USA);
							break;
			case MINI : car = new MiniCar(Location.USA);
						break;		
			case LUXURY : car = new LuxuryCar(Location.USA);
						break;
		}
		
		return car;
		
	}
}
