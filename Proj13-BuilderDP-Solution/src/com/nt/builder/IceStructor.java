package com.nt.builder;

import com.nt.product.IStructure;

public class IceStructor implements IStructure {
	public IceStructor() {
		System.out.println("IceStructor:: 0-param constructor");
	}

	@Override
	public String toString() {
		return "IceStructor []";
	}

}
