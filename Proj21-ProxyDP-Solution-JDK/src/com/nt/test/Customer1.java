package com.nt.test;

import java.util.Arrays;

import com.nt.component.IBankService;
import com.nt.factory.BankServiceFactory;

public class Customer1 {
	public static void main(String[] args) {
		IBankService service = BankServiceFactory.getInstance(true);
		System.out.println(service.getClass() + ".... " + service.getClass().getSuperclass() + "......"
				+ Arrays.toString(service.getClass().getInterfaces()));
		System.out.println(service.withdraw(10001, 30000));
		System.out.println("=========================");
		System.out.println(service.withdraw(10001, 3000));
	}
}
