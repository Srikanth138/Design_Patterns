package com.nt.factory;

import com.nt.component.BankServiceImpl;
import com.nt.component.IBankService;
import com.nt.proxy.BankServiceProxyImpl;

public class BankServiceFactory {
	public static IBankService getInstance(boolean demonitisation) {
		IBankService service = null;
		if (demonitisation)
			service = new BankServiceProxyImpl();
		else
			service = new BankServiceImpl();
		return service;
	}// method
}// class
