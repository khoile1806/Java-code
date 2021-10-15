package com.khoilg2008110135.tuan5.cow;

public class Cow {
    int age;
	int weight;
	    
	Cow(int year,int amount){
		age = year;
		weight = amount;
	}
	    
	void showData(){
		System.out.println("age: "+age);
		System.out.println("Weight: "+weight+" Kg");
	}
	
	void ren(String text){
		switch(text)
		{
		case "hello":
			System.out.println("con bò ngungok");
			break;
		
		default :
			System.out.println("bò chưa sinh ra , hãy đẻ thêm bò !!!");
		}
	}
}
