package com.khoilg2008110135.tuan7.animal;

public class Wolf extends Canine {
    @Override
    public void makeNoices(){
        System.out.println("Wolf barking !!!");
    }

    @Override
    protected void eatFood(){
        System.out.println("all of meat !!!");
    } 

    void Chase(){
        System.out.println("Hunting for food !!!");
    }

    void Work(){
        System.out.println("Hunting in packs !!!");
    }
}
