package com.khoilg2008110135.tuan9;

public class dog extends Animal{

	/**
	 * @param name
	 * @param d
	 * @param breed
	 */
	public dog(String name, int d, String breed) {
		super(name, d, breed);
	}
	
	@Override
	protected void makeNoise() {
		System.out.println("ẳng ẳng ẳng!!!");
	}

	@Override
	protected void play() {
		System.out.println("reloading !!!");
	}

	@Override
	protected void eat() {
		System.out.println("barking on people !!!");
	}
}
