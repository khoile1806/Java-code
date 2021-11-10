package com.khoilg2008110135.tuan9;

public class testDrive {
	public static void main(String[] args) {
		quanLyDongVat listAnimal = new quanLyDongVat();
		dog dog = new dog("stupid dog", 5.5, "mực");
		cat cat = new cat("pussy cat", 4.5, "mun");
		fish fish = new fish("a dumb fig", 0.8, "Cá");
		listAnimal.add(dog);
		listAnimal.add(cat);
		listAnimal.add(fish);
		listAnimal.makeNoise();
	}	
}
