package com.khoilg2008110135.tuan10;

public class Circle extends Shape {
    private int radius;

    public Circle(int x,int y, int r) {
        super(x,y);
        radius = r;
    }

    public void draw(){
        System.out.println("Draw Circle at"+ x +" "+ y +" with radius "+radius);
    }

    public void erase(){
        System.out.println("Erase Circle at"+x+" "+y);
    }
}