package com.khoilg2008110135.tuan7.animal;

public class Dog extends Canine {

    @Override
    protected void makeNoices(){
        System.out.println("Dog barking !!!");
    }

    @Override
    protected void eatFood(){
        System.out.println("eat dog food !!!");
    } 

    void Chase(){
        System.out.println("cashing Cat !!!");
    }

    void Work(){
        System.out.println("Stay home !!!");
    }
}