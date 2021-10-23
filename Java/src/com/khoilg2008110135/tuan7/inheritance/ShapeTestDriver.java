package com.khoilg2008110135.tuan7.inheritance;

public class ShapeTestDriver {
    public static void main(String[] args) {
        Circle circle = new Circle ();
        circle.rotare ();
        circle.play ();

        System.out.println("------------");

        Square square = new Square ();
        square.rotare ();
        square.play ();

        System.out.println("------------");
        
        Triangle triangle = new Triangle ();
        triangle.rotare ();
        triangle.play ();

        System.out.println("------------");
        Amoeba amoeba = new Amoeba ();
        amoeba.rotare ();
        amoeba.play ();
    }
}