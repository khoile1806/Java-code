package com.khoilg2008110135.bank;
import java .util.Scanner;

import java.util.Scanner;

public class Customer {
	String name;
	String address;

	Scanner scanner = new Scanner(System.in);
	
	String getName(){	
		System.out.print("Ho va ten khach hang: ");
		name = scanner.nextLine();
		return name;
	}

	String getAddress(){
		System.out.print("Dia chi thuong tru cua khach hang: ");
		address = scanner.nextLine();
		return address;
	}

	void show(){
		System.out.println("Ho va ten: " +name);
		System.out.println("Dia chi: " +address);
	}
}