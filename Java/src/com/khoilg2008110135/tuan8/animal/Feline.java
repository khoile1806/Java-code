package com.khoilg2008110135.tuan8.animal;

public class Feline extends Animal {
    public Feline(String picture, String food, int hunger)
	{
		super(picture, food, hunger);
	}
	
	@Override
	protected void roam() {
		System.out.println("alone work");
	}
}
