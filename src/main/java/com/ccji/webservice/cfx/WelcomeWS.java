package com.ccji.webservice.cfx;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * 需要加上endpointInterface及targetNamespace属性，要不会报错
 * @author CC-Ji
 * @date 2017-8-22
 */
@WebService(endpointInterface = "com.ccji.webservice.WelcomeWS" , targetNamespace = "http://cfx.demo.ccji.com/")
public interface WelcomeWS {
	
	@WebMethod
	@WebResult
	public String welcomeMessage(@WebParam String message);

}
