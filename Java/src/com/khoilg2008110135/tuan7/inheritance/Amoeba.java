package com.khoilg2008110135.tuan7.inheritance;

public class Amoeba extends Shape{
    int x,y;

    Amoeba(){};
    
    protected Amoeba(String s){};
    protected Amoeba(int xx,int yy){
        x = xx;
        y = yy;
    };

    protected void rotare(){
        System.out.println("xoay theo toa do x =  "+ x +" va y = " + y );
    };

    protected void play(){
        System.out.println("Amoeba sound");
    }
}
