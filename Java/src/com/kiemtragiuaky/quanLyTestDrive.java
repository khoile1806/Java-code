package com.kiemtragiuaky;

public class quanLyTestDrive {
    private static final Object HocVien = null;

    public static void main(String[] args) {
        danhSachQuanLy list = new danhSachQuanLy();
        NhanVien nhanVien = new NhanVien("null", "null", 5);
        KhachHang khachHang = new KhachHang("null", "null", "null", 3);
        list.themNguoi(nhanVien);
        list.themNguoi(khachHang);
        list.inList();
    }
}