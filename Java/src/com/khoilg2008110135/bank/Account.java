package com.khoilg2008110135.bank;

import java.util.Scanner;

public class Account {
	int account_number;
	int account_balance;

	Scanner scanner = new Scanner(System.in);

	void create(){
		System.out.print("Account Number: ");
		account_number = scanner.nextInt();
		System.out.print("Account Balance: ");
		account_balance = scanner.nextInt();
	}
	
	void show(){
		System.out.println("Account Number = " + account_number);
		System.out.println("Account Balance = " + account_balance);
	}

	void deposit(){
		System.out.print("So du cong them: ");
		int amount = scanner.nextInt();
		account_balance += amount;
	}

	void withdraw(){
		System.out.print("So tien can rut: ");
		int amount = scanner.nextInt();
		account_balance -= amount;
	}

}