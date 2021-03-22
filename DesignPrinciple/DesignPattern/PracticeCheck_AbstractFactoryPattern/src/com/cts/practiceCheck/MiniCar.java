package com.cts.practiceCheck;

public class MiniCar extends Car{

	MiniCar(Location location) {
		super(CarType.MINI, location);
	}

	@Override
	void construct() {
		// TODO Auto-generated method stub
		System.out.println("Connecting to mini car");
	}
}
