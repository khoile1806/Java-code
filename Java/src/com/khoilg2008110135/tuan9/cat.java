package com.khoilg2008110135.tuan9;

public class cat extends Animal{
	
	/**
	 * @param name
	 * @param d
	 * @param breed
	 */
	public cat(String name, double d, String breed) {
		super(name, d, breed);
	}

	@Override
	protected void makeNoise() {
		System.out.println("nheo nheo nigga!!!");
	}

	@Override
	protected void play() {
		System.out.println("reloading");
	}

	@Override
	protected void eat() {
		System.out.println("eating mouse");
	}	

}
