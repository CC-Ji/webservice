package com.ccji.webservice.rmi;

import org.springframework.stereotype.Service;

@Service(value="rmiService")
public class RmiServiceImpl implements RmiService {

	@Override
	public String sayHello(String param) {
		
		return "Hello--" + param;
		
	}

}
