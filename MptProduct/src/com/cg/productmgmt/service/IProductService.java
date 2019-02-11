package com.cg.productmgmt.service;
import java.util.List;
import java.util.Map;

import com.cg.product.exception.ProductException;
public interface IProductService {

	public int updateProducts(String Category,int hike) throws ProductException;
	public Map<String,Integer> getProductDetails() throws ProductException;
	public List<String> findAll();
}
