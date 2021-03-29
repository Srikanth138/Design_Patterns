package com.nt.test;

import com.nt.comp.HireFresher;
import com.nt.factory.HireFresherFactory;

public class NareshITPlacementDept {
	public static void main(String[] args) {
		HireFresher UIFresher = HireFresherFactory.getInstance("ui");
		boolean result = UIFresher.recruiteFresher();
		if (result)
			System.out.println("UI Fresher is selected");
		else
			System.out.println("UI Fresher is not selected");
	}
}
