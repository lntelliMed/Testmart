package com.intellimed;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import com.intellimed.business.ProductServiceImpl;
import com.intellimed.model.Product;

@WebService(endpointInterface = "com.intellimed.ProductCatalogInterface", portName="TestMartCatalogPort", serviceName="TestMartCatalogService")
public class ProductCatalog implements ProductCatalogInterface {
	private ProductServiceImpl productServiceImpl = new ProductServiceImpl();
	
	/* (non-Javadoc)
	 * @see com.intellimed.ProductCatalogInterface#getProductCategories()
	 */
	@Override
	public List<String> getProductCategories(){
		return productServiceImpl.getProductCategories();
	}
	
	//@WebMethod (exclude = true)
	/* (non-Javadoc)
	 * @see com.intellimed.ProductCatalogInterface#getProducts(java.lang.String)
	 */
	@Override
	public List<String> getProducts(String category){
		return productServiceImpl.getProducts(category);
	}
	
	//@WebMethod (exclude = true)
	/* (non-Javadoc)
	 * @see com.intellimed.ProductCatalogInterface#addProduct(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean addProduct(String category, String product) {
		return productServiceImpl.addProduct(category, product);
	}
	
	/* (non-Javadoc)
	 * @see com.intellimed.ProductCatalogInterface#getProductsv2(java.lang.String)
	 */
	@Override
	public List<Product> getProductsv2(String category){
		return productServiceImpl.getProductsv2(category);
	}
}
