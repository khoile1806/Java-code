package com.khoilg2008110135.tuan9;

public class Cat extends animal {
    public Cat(String name, double weight, int age) {
        super(name, weight, age);
    }
    @Override
    public void eat(){
        System.out.println("Cat is eating");
    }
    @Override
    public void sleep(){
        System.out.println("Cat is sleeping");
    }
    @Override
    public void roam(){
        System.out.println("Cat is roaming");
    }
    @Override
    public void chase(){
        System.out.println("Cat is chasing a mouse");
    }
    @Override
    public void makeNoise(){
        System.out.println("Cat is barking !!!");
    }
}

