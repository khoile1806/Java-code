package com.khoilg2008110135.tuan7;

public class Hippo extends Animal {
    @Override
    protected void Roam(){
        System.out.println("Swimming in packs !!!");
    }

    @Override
    protected void makeNoices(){
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
