package com.khoilg2008110135.tuan9;

public class testDrive {
	public static void main(String[] args) {
		quanLyDongVat listAnimal = new quanLyDongVat();
		dog dog = new dog("stupid dog", 3, "mực");
		cat cat = new cat("pussy cat", 10, "mun");
		fish fish = new fish("a dumb fig", 1, "Cá");
		listAnimal.add(dog);
		listAnimal.add(cat);
		listAnimal.add(fish);
		listAnimal.makeNoise();
	}	
}
