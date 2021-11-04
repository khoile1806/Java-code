package com.kiemtragiuaky;

public class KhachHang extends Nguoi{
    private String tenCongTy;
    private double triGiaHoaDon;
    @Override
    public String toString() {
        return super.toString()+" "+tenCongTy+" "+triGiaHoaDon+" VND";
    }
    KhachHang(String hoTen,String diaChi,String tenCongTy,double triGiaHoaDon){
        super(hoTen,diaChi);
        this.tenCongTy = tenCongTy;
        this.triGiaHoaDon = triGiaHoaDon;
    }
}