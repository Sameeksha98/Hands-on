package com.abstractfactory;

public class AudiFactory extends Factory{

	@Override
	Headlight makeHeadlight() {
		// TODO Auto-generated method stub
		return new AudiHeadlight();
	}

	@Override
	Tire makeTire() {
		// TODO Auto-generated method stub
		return new AudiTire();
	}

}
