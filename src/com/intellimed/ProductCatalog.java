package com.intellimed;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import com.intellimed.business.ProductServiceImpl;

@WebService(name="TestMartCatalog", portName="TestMartCatalogPort", serviceName="TestMartCatalogService",
			targetNamespace="http://www.testmart.com")
public class ProductCatalog {
	private ProductServiceImpl productServiceImpl = new ProductServiceImpl();
	
	@WebMethod(action="fetch-categories", operationName="fetchCategories")
	public List<String> getProductCategories(){
		return productServiceImpl.getProductCategories();
	}
	
	@WebMethod (exclude = true)
	public List<String> getProducts(String category){
		return productServiceImpl.getProducts(category);
	}
	
	@WebMethod (exclude = true)
	public boolean addProduct(String category, String product) {
		return productServiceImpl.addProduct(category, product);
	}
	
}
