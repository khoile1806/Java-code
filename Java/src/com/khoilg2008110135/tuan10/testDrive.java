package com.khoilg2008110135.tuan10;

public class testDrive {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();
        animal.sleep();

        Circle circle = new Circle(2,5,7);
        circle.draw();
        circle.erase();
    }
}
