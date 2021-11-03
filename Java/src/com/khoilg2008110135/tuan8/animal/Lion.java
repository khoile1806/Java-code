package com.khoilg2008110135.tuan8.animal;

public class Lion extends Canine {
    /**
	 * @param picture
	 * @param food
	 * @param hunger
	 */
	public Lion(String picture, String food, int hunger) {
		super(picture, food, hunger);	
	}

	protected String picture = "Picture of Lion";
	protected String food = "meat";
	protected int hunger = 1;

	@Override
	protected void makeNoise() {
		System.out.println("Lion Barking !!!");
	}

	@Override
	protected void eat() {
		System.out.println("Lion eating !!!");
	}

	void hunter(){
		System.out.println("Lion hungting");
	}
}
