package com.khoilg2008110135.tuan8.animal;

public class Cat extends Feline {
    protected String picture = "Picture of cat";
	protected String food = "cat food";
	protected int hunger = 5;

	public Cat(String picture, String food, int hunger)
	{
		super(picture,food,hunger);
	}

	@Override
	protected void makeNoise() {
		System.out.println("cat barking !!!");
	}

	@Override
	protected void eat() {
		System.out.println("dont wana eat this shit !!");
	}

	void chaseMouse(){
		System.out.println("catching mouse!!!");
	}
}
