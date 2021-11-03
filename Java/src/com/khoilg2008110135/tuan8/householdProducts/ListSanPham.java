package com.khoilg2008110135.tuan8.householdProducts;
import java.util.ArrayList;
import java.util.List;

public class ListSanPham {
	public static void main(String[] args) {
		List<SanPhamUpgrade> list = new ArrayList<>();

		SanPhamUpgrade sp1 = new SanPhamUpgrade("bàn cờ tướng", 200000);
		SanPhamUpgrade sp2 = new SanPhamUpgrade("latop", 15000000,125000000);
		SanPhamUpgrade sp3 = new SanPhamUpgrade("Bàn chải", 10000,6000);

		list.add(sp1);
		list.add(sp2);
		list.add(sp3);

		for (SanPhamUpgrade sanPhamUpgrade : list) {
			sanPhamUpgrade.xuat();
		}
	}	
}