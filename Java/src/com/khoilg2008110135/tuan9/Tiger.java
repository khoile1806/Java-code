package com.khoilg2008110135.tuan9;

public class Tiger  extends animal{
    public Tiger(String name , double weight, int age) {
        super(name, weight, age);
    }

    @Override
    public void eat(){
        System.out.println("Tiger eat meat");  
    }
    @Override
    public void sleep(){
        System.out.println("Tiger is sleeping");
    }
    @Override
    public void roam(){
        System.out.println("hunting alone");
    }
    @Override
    public void chase(){
        System.out.println("Tiger is chasing all animal");
    }
    @Override
    public void makeNoise(){
        System.out.println("Tiger is barking !!!!");
    }
}
