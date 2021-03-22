package com.AdapterPattern;

public class MovableAdapterImpl implements MovableAdapter{

	private Movable luxuryCars;
	
	
	public MovableAdapterImpl() {
		super();
		// TODO Auto-generated constructor stub
	}


	public MovableAdapterImpl(Movable luxuryCars) {
		super();
		this.luxuryCars = luxuryCars;
	}


	@Override
	public double getSpeed() {
		// TODO Auto-generated method stub
		return convertMPHtoKMPH(luxuryCars.getSpeed());
	}
	
	private double convertMPHtoKMPH(double mph) {
		return mph * 1.60934; 
	}


	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return convertUSDtoEuro(luxuryCars.getPrice());
	}
	
	private double convertUSDtoEuro(double price) {
		return 0.84 * price;
	}

}
