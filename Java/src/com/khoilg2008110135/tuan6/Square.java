package com.khoilg2008110135.tuan6;

public class Square {
    String Suond = "Square sound";
    boolean click = false;

    void rotare() {
        System.out.printf("run around X3");
        click = true;
    }

    void play() {
        if (click == true) {
            System.out.printf("sound playing: " + Suond);
        } else
            System.out.printf("error");
    }
}
