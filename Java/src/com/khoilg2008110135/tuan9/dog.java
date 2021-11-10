package com.khoilg2008110135.tuan9;

public class Dog extends animal {
    public Dog(String name, double weight, int age) {
        super(name, weight, age);
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep(){
        System.out.println("Dog is sleeping");
    }

    @Override
    public void roam() {
        System.out.println("play catch with the boss");
    }

    @Override
    public void chase() {
        System.out.println("Dog is chasing the cat");
    }

    @Override
    public void makeNoise() {
        System.out.println("Dog is barking");
    }
}
