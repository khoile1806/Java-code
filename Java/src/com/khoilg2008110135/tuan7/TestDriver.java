package com.khoilg2008110135.tuan7;

public class TestDriver {
    public static void main(String[] args){
        Lion lion = new Lion ();
        lion.makeNoices();
        lion.eat();
        lion.sleep();
        lion.roam();

        System.out.println("----------");

        Dog dog = new Dog ();
        dog.makeNoices();
        dog.eat();
        dog.sleep();
        dog.ruotMeo();
    }
}
