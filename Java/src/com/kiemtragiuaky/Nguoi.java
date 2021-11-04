package com.kiemtragiuaky;
import java.util.Scanner;

public class Nguoi {
    private String hoTen;
    private String diaChi;
    public String toString() {
        return hoTen+" "+diaChi;
    }
    Nguoi(String hoTen,String diaChi){
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }
}
