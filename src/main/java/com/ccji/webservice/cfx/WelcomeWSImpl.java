package com.ccji.webservice.cfx;

public class WelcomeWSImpl implements WelcomeWS {

	@Override
	public String welcomeMessage(String message) {
		
		return "»¶Ó­" + message;
	}

}
