package com.khoilg2008110135.tuan7.animal;

public class Lion extends Feline {

    @Override
    protected void eatFood (){
        System.out.println("all of meat !!!");
    }

    @Override
    public void makeNoices(){
        System.out.println("Lion Barking !!!");
    }

    void Chase(){
        System.out.println("Hunting For food !!!");
    }

    void Work(){
        System.out.println("Hunting in packs!!!");
    }
}
