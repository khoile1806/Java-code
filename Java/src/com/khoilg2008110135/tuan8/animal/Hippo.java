package com.khoilg2008110135.tuan8.animal;

public class Hippo extends Animal {
    /**
	 * @param picture
	 * @param food
	 * @param hunger
	 */
	public Hippo(String picture, String food, int hunger) {
		super(picture, food, hunger);
	}

	@Override
	protected void makeNoise() {
		System.out.println("Hippo đang kêu!!!");
	}


}
