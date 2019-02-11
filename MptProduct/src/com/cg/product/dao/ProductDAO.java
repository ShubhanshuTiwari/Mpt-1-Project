package com.cg.product.dao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cg.product.exception.ProductException;
public class ProductDAO implements IProductDAO {
   
	static Map<String,String> productDetails;
	static Map<String,Integer> salesDetails;

	static {
		
		productDetails=new HashMap<>();
		productDetails.put("lux", "soap");
		productDetails.put("colgate", "paste");
		productDetails.put("pears", "soap");
		productDetails.put("sony", "Electronics");
		productDetails.put("samsung", "Electronics");
		productDetails.put("facepack", "cosmatics");
		productDetails.put("facecream", "cosmatics");
		
		salesDetails=new HashMap<>();
		salesDetails.put("lux", 100);
		salesDetails.put("colgate", 50);
		salesDetails.put("pears", 70);
		salesDetails.put("sony", 10000);
		salesDetails.put("samsung", 23000);
		salesDetails.put("facepack", 100);
		salesDetails.put("facecream", 60);
	}
	@Override
	public int updateProducts(String Category, int hike) throws ProductException {
		// TODO Auto-generated method stub
		  for (Map.Entry<String, String> i: productDetails.entrySet()) {
			  if(i.getValue().equals(Category)) {
				  int price=salesDetails.get(i.getKey());
				  salesDetails.put(i.getKey(), price+hike);
			  }
	        }
		
	System.out.println(salesDetails);	
		return 0;
	}


	@Override
	public Map<String, Integer> getProductDetails() throws ProductException {
		// TODO Auto-generated method stub
		return salesDetails;
	}
	public List<String> findAll()
	{
		List<String> list=new ArrayList<>(productDetails.values());
		return list;
	}

}
