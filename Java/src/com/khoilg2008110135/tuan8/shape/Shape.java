package com.khoilg2008110135.tuan8.shape;

public class Shape {
	private String sound;
	protected boolean state = false;

	public Shape(){};

	public Shape(String s){
		sound = s;
	}
	
	/**
	 * @return the sound
	 */
	public String getSound() {
		return sound;
	}

	/**
	 * @param sound the sound to set
	 */
	public void setSound(String sound) {
		this.sound = sound;
	}

	protected void rotate(){
		System.out.println("Da xoay 360, backlip cac thu"); 
		state = true;	
	}

	protected void playSound(){
		if(state == true)
		{
			System.out.println("Am thanh dang duoc phat: " + sound);
			System.out.println("	***Ket thuc***");
		}
		else
			System.out.println("Co loi!!!");
	}
}

