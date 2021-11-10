package com.khoilg2008110135.tuan9;

import java.util.ArrayList;

public class quanLyDongVat {
	ArrayList<Animal> list = new ArrayList<Animal>();
	
	public void add(Animal animal)
	{
		list.add(animal);
	}

	public void feed()
	{
		for (Animal animal : list) {
			animal.eat();
		}
	}

	public void makeNoise()
	{
		for (Animal animal : list) {
			animal.makeNoise();
		}
	}

	public void sleep()
	{
		for (Animal animal : list) {
			animal.sleep();
		}
	}

	public Animal findName(String name)
	{
		dog d = null;

		for (Animal animal : list) {
			if(animal instanceof dog){
				dog dog = (dog)animal;
				if(dog.getName().equalsIgnoreCase(name))
					d = dog;
			}			
		}
		return d;
	}
}