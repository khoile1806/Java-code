package com.khoilg2008110135.tuan7.animal;

public class Hippo extends Animal {
    @Override
    public void Roam(){
        System.out.println("Swimming in packs !!!");
    }

    @Override
    public void makeNoices(){
        System.out.println("Hippo barking !!!");
    }

    @Override
    protected void eatFood(){
        System.out.println("I got no idea !!!");
    } 

    void Chase(){
        System.out.println("no idea again!!!");
    }

    void Work(){
        System.out.println("Swimming in the river !!!");
    }
}
