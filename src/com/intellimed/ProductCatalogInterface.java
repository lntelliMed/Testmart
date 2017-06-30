package com.intellimed;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.intellimed.model.Product;

@WebService(name="TestMartCatalog", portName="TestMartCatalogPort", serviceName="TestMartCatalogService",
targetNamespace="http://www.testmart.com")
public interface ProductCatalogInterface {

	@WebMethod(action="fetch-categories", operationName="fetchCategories")
	List<String> getProductCategories();

	@WebMethod
	List<String> getProducts(String category);

	@WebMethod
	boolean addProduct(String category, String product);

	@WebMethod
	List<Product> getProductsv2(String category);

}