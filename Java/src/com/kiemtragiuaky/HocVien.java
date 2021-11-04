package com.kiemtragiuaky;
import java.util.Scanner;

public class HocVien {
    private float diemMonHoc1;
    private float diemMonHoc2;
    private float diemTB;

    HocVien() {}
    public HocVien(float diemMonHoc1, float diemMonHoc2, float diemTB) {
        this.diemMonHoc1 = diemMonHoc1;
        this.diemMonHoc2 = diemMonHoc2;
        this.diemTB = diemTB;
    }

    public void nhapDiem(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap diem mon hoc 1");
        scanner.nextLine();
        this.diemMonHoc1 = scanner.nextFloat();
        System.out.println("nhap diem mon hoc 2");
        scanner.nextLine();
        this.diemMonHoc2 = scanner.nextFloat();
    }

    public void diemTB(){
        diemTB = (diemMonHoc1 + diemMonHoc2) / 2;
    }

    public String toString() {
        return "HocVien{" +
                "diemMonHoc1=" + diemMonHoc1 +
                ", diemMonHoc2=" + diemMonHoc2 +
                ", diemTB=" + diemTB +
                '}';
    }
}
