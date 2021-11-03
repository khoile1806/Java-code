package com.khoilg2008110135.tuan8.animal;

public class Animal {
    private String picture;
	private String food;
	private int hunger;
	private String boundaries;
	private int location;

	public Animal(String picture, String food, int hunger)
	{
		this.picture = picture;
		this.food = food;
		this.hunger = hunger;
	}

	/**
	 * @return the picture
	 */
	public String getPicture() {
		return picture;
	}

	/**
	 * @return the food
	 */
	public String getFood() {
		return food;
	}

	/**
	 * @return the hunger
	 */
	public int getHunger() {
		return hunger;
	}

	protected void makeNoise(){
		System.out.println("barking");
	}

	protected void eat(){
		System.out.println("eating normal");
	}
	
	protected void sleep(){
		System.out.println("sleeping !!!");
	}

	protected void roam(){
		System.out.println("run around");
	}
}
