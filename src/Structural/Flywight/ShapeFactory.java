package Structural.Flywight;

import java.util.HashMap;

public class ShapeFactory {

	private static final HashMap<String, Circle> circleMap = new HashMap<String, Circle>();

	public static IShape getCircle(final String color) {
		Circle circle = (Circle) circleMap.get(color);

		if (circle == null) {
			circle = new Circle(color);
			circleMap.put(color, circle);
			System.out.println("Creating circle of color : " + color);
		}
		return circle;
	}
}