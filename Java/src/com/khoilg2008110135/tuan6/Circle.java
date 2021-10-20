package com.khoilg2008110135.tuan6;

public class Circle {
    String Sound = "Circle sound";
    boolean click = false;

    void rotare() {
        System.out.printf("run around X3");
        click = true;
    }

    void play() {
        if (click == true) {
            System.out.printf("sound playing: " + Sound);
        } else
            System.out.printf("error");
    }
}
