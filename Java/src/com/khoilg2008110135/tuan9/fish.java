package com.khoilg2008110135.tuan9;

public class fish extends Animal{

	/**
	 * @param name
	 * @param d
	 * @param breed
	 */
	public fish(String name, int d, String breed) {
		super(name, d, breed);
	}
	
	@Override
	protected void makeNoise() {
		System.out.println("got no idea!!!");
	}

	@Override
	protected void play() {
		System.out.println("dont know dont ask !!!");
	}

	@Override
	protected void eat() {
		System.out.println("eating shit!");
	}
}
