package com.app;

import java.util.Scanner;

public class Clerk {
	public static void main(String[] args) { 
		Scanner scn=new Scanner(System.in);
		BankAccount ba=new BankAccount();
		System.out.println("Enter Balance to be Deposited: ");
		ba.setBalance(scn.nextInt());
		System.out.println("your Balance is: "+ba.getBalance());
		System.out.println("==================");
		
		BankAccount ba1=new BankAccount();
		System.out.println("Enter Balance to be Deposited: ");
		ba1.setBalance(scn.nextInt());
		System.out.println("your Balance is: "+ba1.getBalance());
		System.out.println("==================");
	}

}
