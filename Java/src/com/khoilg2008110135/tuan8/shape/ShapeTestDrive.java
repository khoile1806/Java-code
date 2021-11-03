package com.khoilg2008110135.tuan8.shape;

public class ShapeTestDrive {
	public static void main(String[] args) {
		Circle tron = new Circle("Circle.AIF");
		Square vuong = new Square("Square.AIF");
		Triangle tamGiac = new Triangle("Triangle.AIF");
		Amoeba amoeba = new Amoeba("Amoeba.HIF",5, 10);
		

		tron.rotate();
		tron.playSound();

		vuong.rotate();
		vuong.playSound();

		tamGiac.rotate();
		tamGiac.playSound();

		amoeba.rotate();
		amoeba.playSound();
	}	
}