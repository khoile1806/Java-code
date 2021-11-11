package com.khoilg2008110135.tuan10;

abstract public class Shape {
    protected int x,y;
    Shape(int x,int y) {
        this.x = x ;
        this.y = y ;
    }

    abstract public void draw();
    abstract public void erase();

    public void moveTo(int x,int y) {
        erase();
        this.x = x;
        this.y = y;
        draw();
    }
}
