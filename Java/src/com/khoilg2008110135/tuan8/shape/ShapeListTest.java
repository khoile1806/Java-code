package com.khoilg2008110135.tuan8.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeListTest {
	public static void main(String[] args) {
		List<Shape> list = new ArrayList<>();

		Circle circle = new Circle("Circle.AIF");
		Square square = new Square("Square.AIF");
		Triangle triangle = new Triangle("Triangle.AIF");
		Amoeba amoeba = new Amoeba("Amoeba.HIF", 5, 10);

		list.add(circle);
		list.add(square);
		list.add(triangle);
		list.add(amoeba);

		for (Shape shape : list) {
			shape.rotate();
			shape.playSound();
		}
	}	
}
