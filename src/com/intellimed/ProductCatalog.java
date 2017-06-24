package com.intellimed;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import com.intellimed.business.ProductServiceImpl;

@WebService
public class ProductCatalog {
	private ProductServiceImpl productServiceImpl = new ProductServiceImpl();
	
	@WebMethod
	public List<String> getProductCategories(){
		return productServiceImpl.getProductCategories();
	}
	
	@WebMethod
	public List<String> getProducts(String category){
		return productServiceImpl.getProducts(category);
	}
	
	@WebMethod
	public boolean addProduct(String category, String product) {
		return productServiceImpl.addProduct(category, product);
	}
	
}
