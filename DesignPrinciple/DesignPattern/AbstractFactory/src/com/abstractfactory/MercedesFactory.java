package com.abstractfactory;

public class MercedesFactory extends Factory{

	@Override
	Headlight makeHeadlight() {
		// TODO Auto-generated method stub
		return new MercedesHeadlight();
	}

	@Override
	Tire makeTire() {
		// TODO Auto-generated method stub
		return new MercedesTire();
	}

}
