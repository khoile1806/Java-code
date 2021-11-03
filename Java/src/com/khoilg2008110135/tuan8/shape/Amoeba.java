package com.khoilg2008110135.tuan8.shape;

public class Amoeba extends Shape{
	private int x;
	private int y;

	public Amoeba(String s, int xx, int yy){
		super(s);
		x = xx;
		y = yy;
	}


	@Override
	protected void rotate() {
		System.out.println("Xoay 360 theo toa do x = " + x + " va y = " + y);
		state = true;
	}

	@Override
	protected void playSound() {
		if(state == true)
			System.out.println("Đang mở file... " + getSound());
		else
			System.out.println("Xảy ra lỗi");
	}
}
