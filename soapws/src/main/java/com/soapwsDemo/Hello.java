package com.soapwsDemo;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding
public interface Hello {

	@WebMethod
	public String sayHello(String name);
}
