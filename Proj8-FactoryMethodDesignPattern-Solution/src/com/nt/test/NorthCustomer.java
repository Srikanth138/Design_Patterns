package com.nt.test;

import com.nt.comps.BajajBike;
import com.nt.factory.BajajBikeFactory;
import com.nt.factory.BajajBikeFactoryLocator;

public class NorthCustomer {
	public static void main(String[] args) {
		BajajBikeFactory factory = BajajBikeFactoryLocator.buildBikeFactory("noida");
		BajajBike bike = factory.orderBike("pulsor");

	}

}
