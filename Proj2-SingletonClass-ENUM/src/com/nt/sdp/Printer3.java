package com.nt.sdp;

public enum Printer3 implements Cloneable {

	INSTANCE; // internally it equal to public static final Printer3 INSTANCE=new Printer3();

	// static factory method (optional)
	public static Printer3 getInstance() {
		return INSTANCE;
	}

	public void print(String msg) {
		System.out.println(msg);
	}

}
