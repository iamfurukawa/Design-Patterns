package Structural.Facade;

public class ExecFacade {
	
	public static void main(String[] args) {
		final ShapeMaker shapeMaker = new ShapeMaker();

		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}
}