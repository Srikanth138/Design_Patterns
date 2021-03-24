package com.nt.test;

import com.nt.comps.BajajBike;
import com.nt.factory.BajajBikeFactory;
import com.nt.factory.BajajBikeFactoryLocator;

public class SouthCustomer {

	public static void main(String[] args) {
		BajajBikeFactory factory = BajajBikeFactoryLocator.buildBikeFactory("chennai");
		BajajBike bike = factory.orderBike("pulsor");
		bike.drive();

	}
}
