package com.khoilg2008110135.tuan8.householdProducts;

import java.util.Scanner;

public class SanPham {
	private String tenSp;
	private double donGia;
	private double giamGia;

	public SanPham()
	{

	}

	/**
	 * @param tenSp
	 * @param donGia
	 * @param giamGia
	 */
	public SanPham(String tenSp, double donGia, double giamGia) {
		this.tenSp = tenSp;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}

	/**
	 * @return the donGia
	 */
	public double getDonGia() {
		return donGia;
	}

	/**
	 * @param donGia the donGia to set
	 */
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	/**
	 * @return the giamGia
	 */
	public double getGiamGia() {
		return giamGia;
	}

	/**
	 * @param giamGia the giamGia to set
	 */
	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}

	/**
	 * @return the tenSp
	 */
	public String getTenSp() {
		return tenSp;
	}

	/**
	 * @param tenSp the tenSp to set
	 */
	public void setTenSp(String tenSp) {
		this.tenSp = tenSp;
	}

	public double getThueNhapKhau()
	{
		double thue;
		thue = donGia * 15/100;
		return thue;
	}

	public void xuat()
	{
		System.out.println("Tên sản phẩm: "+ tenSp);
		System.out.println("Đơn giá: "+ donGia);
		System.out.println("Giảm giá: "+ giamGia);
		System.out.println("Thuế nhập khẩu: "+ getThueNhapKhau());
		System.out.println("-------------------");
	}

	public void nhap()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập tên: ");
		tenSp = scanner.nextLine();
		System.out.print("Nhập giá: ");
		donGia = scanner.nextDouble();
		System.out.print("Nhập phieu giảm giá: ");
		giamGia = scanner.nextDouble();
	}
}