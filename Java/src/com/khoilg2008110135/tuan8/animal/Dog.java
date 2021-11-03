package com.khoilg2008110135.tuan8.animal;

public class Dog extends Animal{
    /**
	 * @param picture
	 * @param food
	 * @param hunger
	 */
	public Dog(String picture, String food, int hunger) {
		super(picture,food,hunger);
	}

	@Override
	protected void makeNoise() {
		System.out.println("dog barking !!!");
	}

	@Override
	protected void eat() {
		System.out.println("dog eat shit !!!");
	}

	void chaseCat(){
		System.out.println("laughing on cat");
	}
}
