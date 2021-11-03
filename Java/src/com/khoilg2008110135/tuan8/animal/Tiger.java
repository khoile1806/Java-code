package com.khoilg2008110135.tuan8.animal;

public class Tiger extends Canine{
    
	/**
	 * @param picture
	 * @param food
	 * @param hunger
	 */
	public Tiger(String picture, String food, int hunger) {
		super(picture, food, hunger);
	}

	@Override
	protected void makeNoise() {
		System.out.println("Tiger barking !!!");
	}

	@Override
	protected void eat() {
		System.out.println("Tiger eating food");
	}
}
