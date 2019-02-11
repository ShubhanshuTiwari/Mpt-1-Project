package com.cg.productmgmt.service;
import java.util.List;
import java.util.Map;

import com.cg.product.dao.IProductDAO;
import com.cg.product.dao.ProductDAO;
import com.cg.product.exception.ProductException;

public class ProductService implements IProductService {
	IProductDAO productdaoref=new ProductDAO();
	@Override
	public int updateProducts(String Category, int hike) throws ProductException {
		// TODO Auto-generated method stub
		return productdaoref.updateProducts(Category, hike);
	}

	@Override
	public Map<String, Integer> getProductDetails() throws ProductException {
		// TODO Auto-generated method stub
		return productdaoref.getProductDetails();
	}

	
	public List<String> findAll(){
		return productdaoref.findAll();
	}
	

}
