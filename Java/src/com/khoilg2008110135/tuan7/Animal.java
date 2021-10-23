package com.khoilg2008110135.tuan7;

public class Animal {
    private String picture;
    private String food;
    private String boundaries;
    private int hunger;
    private int location;

    protected void makeNoices() {
        System.out.println("hahaha");
    }

    protected void eatFood() {
        System.out.println("an uong");
    }

    protected void sleep(){
        System.out.println("kho kho");
    }

    protected void roam(){
        System.out.println("di vong quanh");
    }
}
