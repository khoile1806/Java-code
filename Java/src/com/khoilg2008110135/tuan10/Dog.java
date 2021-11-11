package com.khoilg2008110135.tuan10;

public class Dog extends Animal {
    public Dog() {
        super();
    }

    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}
