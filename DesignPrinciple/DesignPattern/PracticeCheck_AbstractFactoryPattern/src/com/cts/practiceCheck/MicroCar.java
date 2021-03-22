package com.cts.practiceCheck;

public class MicroCar extends Car{

	MicroCar(Location location) {
		super(CarType.MICRO, location);
	}

	@Override
	void construct() {
		// TODO Auto-generated method stub
		System.out.println("Connecting to micro car");
	}
}
