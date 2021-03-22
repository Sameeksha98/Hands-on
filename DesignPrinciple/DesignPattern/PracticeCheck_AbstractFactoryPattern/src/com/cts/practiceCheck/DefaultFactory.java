package com.cts.practiceCheck;

public class DefaultFactory extends CarFactory{

	public static Car buildCar(CarType type) {
		
		Car car = null;
		
		switch(type) {
			case MICRO : car = new MicroCar(Location.DEFAULT);
							break;
			case MINI : car = new MiniCar(Location.DEFAULT);
						break;		
			case LUXURY : car = new LuxuryCar(Location.DEFAULT);
						break;
		}
		
		return car;
		
	}
}
