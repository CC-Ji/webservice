package com.ccji.webservice.burlap;

public class BurlapServiceImpl implements BurlapService {

	@Override
	public String sayHello(String param) {
		return "Hello  " + param;
	}

}
