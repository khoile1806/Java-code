package com.khoile;

public class testDriver {
    public static void main(String[] args){
        Test test = new Test ();
        int tong1 = test.tong(7,8);
        int tong2 = test.tong(10,11,25);
        
        System.out.println("tổng: "+ tong1);
        System.out.println("tổng 2: "+ tong2);
    }
}   
