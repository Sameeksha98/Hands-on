package com.cts.practiceCheck;

public class LuxuryCar extends Car{

	LuxuryCar(Location location) {
		super(CarType.LUXURY, location);
	}

	@Override
	void construct() {
		// TODO Auto-generated method stub
		System.out.println("Connecting to luxury car");
	}

}
