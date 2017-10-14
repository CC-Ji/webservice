package com.ccji.webservice.httpinvoker;

import org.springframework.stereotype.Service;

/*@Service(value="httpInvokerService")*/
public class HttpInvokerServiceImpl implements HttpInvokerService {

	@Override
	public String sayHello(String param) {
		return "Hello " + param;
	}

}
