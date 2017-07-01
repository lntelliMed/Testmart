package com.intellimed;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public class ShopInfo {
	
	@WebMethod
	@WebResult(partName = "lookupOutput")
	public String getShopInfo(@WebParam(partName = "lookupInput") String property) throws InvalidInputException{
		//String response = "Invalid property";
		String response = null;
		
		if ("shopInfo".equals(property)){
			return "Test Mart";
		} else if ("since".equals(property)){
			return "since 2012";
		} else {
			throw new InvalidInputException("Invalid Input", property + " is not a valid input");
		}
		
		//return response;
	}
}
