package com.sri;

public abstract class AInter {
	public abstract void min();

	public String max(int a, int b) {
		if (a < b) {
			return b + "is max number";
		} else {
			return a + "is max number";
		}
	}

}
