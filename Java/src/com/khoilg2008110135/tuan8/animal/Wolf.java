package com.khoilg2008110135.tuan8.animal;

public class Wolf extends Canine{
    /**
	 * @param picture
	 * @param food
	 * @param hunger
	 */
	public Wolf(String picture, String food, int hunger) {
		super(picture, food, hunger);
	}

	@Override
	protected void makeNoise() {
		System.out.println("Wolf barking !!!");
	}

	@Override
	protected void eat() {
		System.out.println("team working");
	}
}
