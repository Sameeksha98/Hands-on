package com.FacadePattern;

public class FacadePatternDemo {

	
	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();
		
		shapeMaker.circleDraw();
		shapeMaker.rectangleDraw();
		shapeMaker.squareDraw();
	}
	
}
