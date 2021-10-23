package com.khoilg2008110135.tuan7;

public class Tiger extends Feline {
    @Override
    protected void eatFood (){
        System.out.println("all of meat !!!");
    }

    @Override
    protected void makeNoices(){
        System.out.println("Tiger Barking !!!");
    }

    void Chase(){
        System.out.println("Hunting For food !!!");
    }

    void Work(){
        System.out.println("Alone Hunting !!!");
    }
}
