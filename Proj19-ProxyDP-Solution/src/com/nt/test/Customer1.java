package com.nt.test;

import com.nt.factory.BankServiceFactory;

public class Customer1 {
	public static void main(String[] args) {
		System.out.println(BankServiceFactory.getInstance(true).withdraw(1256, 5000));
//		System.out.println(BankServiceFactory.getInstance(false).withdraw(1256, 2000));
	}

}
