package com.ccji.webservice.hessian;

import org.springframework.stereotype.Service;
/**
 * 
 * @author CC-Ji
 * @date 2017-8-27
 */
/*@Service(value = "hessianService")*/
public class HessianServiceImpl implements HessianService {

	@Override
	public String sayHello(String param) {
		return "Hello  " + param;
	}

}
