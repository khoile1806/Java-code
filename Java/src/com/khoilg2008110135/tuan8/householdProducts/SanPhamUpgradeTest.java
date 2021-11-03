package com.khoilg2008110135.tuan8.householdProducts;

public class SanPhamUpgradeTest {
	public static void main(String[] args) {
		SanPhamUpgrade spGiamGia = new SanPhamUpgrade("Kem đánh răng", 15000,30000);
		SanPhamUpgrade spKhongGiamGia = new SanPhamUpgrade("Sách giáo khoa", 25000);

		spGiamGia.xuat();
		spKhongGiamGia.xuat();
	}	
}