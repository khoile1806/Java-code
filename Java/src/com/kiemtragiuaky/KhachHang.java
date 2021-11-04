package com.kiemtragiuaky;

public class KhachHang extends Nguoi{
    private String tenCongTy;
    private double HoaDon;
    @Override
    public String toString() {
        return super.toString()+" "+tenCongTy+" "+HoaDon+" VND";
    }
    KhachHang(String hoTen,String diaChi,String tenCongTy,double HoaDon){
        super(hoTen,diaChi);
        this.tenCongTy = tenCongTy;
        this.HoaDon = HoaDon;
    }
}