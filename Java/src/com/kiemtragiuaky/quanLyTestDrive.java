package com.kiemtragiuaky;

public class quanLyTestDrive {
    private static final Object HocVien = null;

    public static void main(String[] args) {
        danhSachQuanLy list = new danhSachQuanLy();
        NhanVien nhanVien = new NhanVien("le gia khoi", "100/6", 5);
        KhachHang khachHang = new KhachHang("nguoi nao do", "20/8", "Viet nam", 30000000);
        list.themNguoi(nhanVien);
        list.themNguoi(khachHang);
        list.inList();
    }
}