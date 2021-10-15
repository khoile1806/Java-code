package com.khoilg2008110135.tuan5.employee;

public class employee {
    String name;
	int salary;
	String address;
	String boPhanLamViec;
	String birth;

	employee(String ten, String bPLV, int luong, String ngaySinh, String diaChi){
		name = ten;
		boPhanLamViec = bPLV;
		salary = luong;
		birth = ngaySinh;
		address = diaChi;
	}

	void show(){
		System.out.println("Ten nhan vien: " + name);
		System.out.println("Bo phan lam viec: " + boPhanLamViec);
		System.out.println("Muc luong: " + salary);
		System.out.println("Ngay thang nam sinh: " + birth);
		System.out.println("Dia chi: " + address);
	}
}
