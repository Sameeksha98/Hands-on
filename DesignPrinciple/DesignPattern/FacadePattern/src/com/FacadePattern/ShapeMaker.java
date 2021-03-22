package com.FacadePattern;

public class ShapeMaker {

	private Shape circle;
	private Shape rectangle;
	private Shape square;
	
	public ShapeMaker() {
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}
	
	public void circleDraw() {
		circle.draw();
	}
	
	public void rectangleDraw() {
		rectangle.draw();
	}
	public void squareDraw() {
		square.draw();
	}
}
