package com.khoilg2008110135.tuan9;

public class Animal {
	private String name;
	private int weight;
	private String breed;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 * @param weight
	 * @param breed
	 */
	public Animal(String name, int weight, String breed) {
		this.name = name;
		this.weight = weight;
		this.breed = breed;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(float weight) {
		this.weight = (int) weight;
	}

	/**
	 * @return the breed
	 */
	public String getBreed() {
		return breed;
	}

	/**
	 * @param breed the breed to set
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}

	protected void makeNoise()
	{
		System.out.println("animal barking!!!");
	}

	protected void play()
	{
		System.out.println("reload!!!");
	}

	protected void eat()
	{
		System.out.println("eating some thing!!!");
	}
	
	protected void sleep()
	{
		System.out.println("sleeping !!!!");
	}
}
