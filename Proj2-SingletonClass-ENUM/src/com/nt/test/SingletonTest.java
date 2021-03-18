package com.nt.test;

import com.nt.sdp.Printer1;

public class SingletonTest {

	public static void main(String[] args) throws InterruptedException {
		Printer1 p1=Printer1.getInstance();
		Printer1 p2=Printer1.getInstance();
		
		System.out.println(p1.hashCode()+ " "+p2.hashCode());
		System.out.println("p1==p2 : "+(p1==p2));
		p1.print("xexores");

	}

}
