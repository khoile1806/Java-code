package com.khoilg2008110135.tuan8.animal;
import java.util.ArrayList;
import java.util.List;

public class TestDriver {
    public static void main(String[] args) {
		Cat meo = new Cat("picture of cat","eating cat food", 5);

		Dog cho = new Dog("picture of dog", "eating dog food", 5);
		
		Lion suTu = new Lion("picture of lion", "meat", 1);
		
		Wolf soi = new Wolf("picture of wolf","meat", 2);
		
		Tiger ho = new Tiger("picture of tiger","meat", 2);
		
		Hippo haMa = new Hippo("picture of hippo", "vegetables", 5);
		
		List<Animal> list = new ArrayList<>();

		list.add(meo);
		list.add(cho);
		list.add(suTu);
		list.add(soi);
		list.add(ho);
		list.add(haMa);

		for (Animal animal : list ) {
			animal.makeNoise();
			animal.eat();
			animal.roam();
			System.out.println("-----------------");
		}
	}	
}
