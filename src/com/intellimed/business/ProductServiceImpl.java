package com.intellimed.business;

import java.util.ArrayList;
import java.util.List;

import com.intellimed.model.Product;

public class ProductServiceImpl {
	private List<String> bookList = new ArrayList<>();
	private List<String> musicList = new ArrayList<>();
	private List<String> movieList = new ArrayList<>();
	
	public ProductServiceImpl(){
		bookList.add("Book #1");
		bookList.add("Book #2");
		bookList.add("Book #3");
		
		musicList.add("Song #1");
		musicList.add("Song #2");
		musicList.add("Song #3");
		
		movieList.add("Movie #1");
		movieList.add("Movie #2");
		movieList.add("Movie #3");
	}

	public List<String> getProductCategories(){
		List<String> categories = new ArrayList<>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		return categories;
	}
	
	public List<String> getProducts(String category){
		switch (category.toLowerCase()) {
		case "books":
			return bookList;
		case "music":
			return musicList;
		case "movies":
			return movieList;
		}
		return null;
	}
	
	public boolean addProduct(String category, String product){
		switch (category.toLowerCase()){
		case "books":
			bookList.add(product);
			break;
		case "music":
			musicList.add(product);
			break;
		case "movies":
			movieList.add(product);
			break;	
		default:
			return false;
		}	
		return true;
	}

	public List<Product> getProductsv2(String category) {
		List<Product> productList = new ArrayList<>();
		productList.add(new Product ("Book #1", "1234", 84.99));
		productList.add(new Product ("Book #2", "ABCD", 24.99));
		return productList;
	}
}
