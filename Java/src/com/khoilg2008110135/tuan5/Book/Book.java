package com.khoilg2008110135.tuan5.Book;

public class Book {
    int giaNhap;
	int giaBan;
	int soLuong;
	String nhaSanXuat;
	String namSanXuat;
	String loai;


	Book (int gN, int gB, int sL, String nSX, String namSX, String l) {
		giaNhap = gN;
		giaBan = gB;
		soLuong = sL;
		nhaSanXuat = nSX;
		namSanXuat = namSX;
		loai = l;
	}


	void show() {
		System.out.println("Loai: " + loai);
		System.out.println("So luong: " + soLuong);
		System.out.println("Nha san xuat: " + nhaSanXuat);
		System.out.println("Nam san xuat: " + namSanXuat);
		System.out.println("Gia nhap: " + giaNhap);
		System.out.println("Gia ban: " + giaBan);
	}

	void sell(int amount, String daySell) {
		if(soLuong < amount){
			System.out.println("Khong du so luong sach!!!");
			amount -= soLuong;
			System.out.println("Con thieu " + amount + " quyen!!!");
		}
		soLuong -= amount;
		System.out.println("Ngay ban: " + daySell);
		System.out.println("So luong ban: " + amount);
	}

	void amountLeft(){
		System.out.println("So sach con lai: " + soLuong);
	}
}
