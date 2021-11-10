package com.khoilg2008110135.tuan7.animal;

public class Cat extends Feline {
    @Override
    public void makeNoices(){
        System.out.println("cat barking !!!");
    }

    @Override
    protected void eatFood(){
        System.out.println("eat a mouse !!!");
    } 

    void Chase(){
        System.out.println("cashing a mouse!!!");
    }

    void Work(){
        System.out.println("Sleeping all day !!!");
    }
}
