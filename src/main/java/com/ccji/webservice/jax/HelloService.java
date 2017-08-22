package com.ccji.webservice.jax;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class HelloService {
	@WebMethod
	public String sayHello(String name){
		return "Hello" + name;
	}
	
	public static void main(String[] args){
		HelloService helloService = new HelloService();
		Endpoint.publish("http://localhost:8080/helloService", helloService);
	}
}
