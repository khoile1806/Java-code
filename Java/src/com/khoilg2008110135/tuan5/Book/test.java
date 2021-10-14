package com.khoilg2008110135.tuan5.Book;

public class test {
    public static void main(String[] args) {
		Book sachGiaoKhoa;
		sachGiaoKhoa = new Book(30000, 35000, 100, "Bo Giao Duc", "12/2021", "Sach");
		
		sachGiaoKhoa.show();
		sachGiaoKhoa.sell(2,"13/10/2021");
		sachGiaoKhoa.amountLeft();
		sachGiaoKhoa.sell(20,"14/10/2021");
		sachGiaoKhoa.amountLeft();
	}	
}
