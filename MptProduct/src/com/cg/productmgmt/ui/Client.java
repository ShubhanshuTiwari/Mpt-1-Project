package com.cg.productmgmt.ui;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.cg.product.exception.ProductException;
import com.cg.productmgmt.service.IProductService;
import com.cg.productmgmt.service.ProductService;

public class Client {
	
	static boolean isValid(String name) {
		IProductService productserviceref=new ProductService();
		List<String>list=productserviceref.findAll();
		if(list.contains(name))
			return true;
		return false;
	}
		
	public static void main(String[] args) throws ProductException {
		// TODO Auto-generated method stub
		IProductService productserviceref=new ProductService();
			Scanner sc=new Scanner(System.in);
			
			Map<String,Integer> map;
		while(true) {
			System.out.println("Enter a choice");
			System.out.println("1 Update product price ");
			System.out.println("2 Exit");
			
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:System.out.println("Enter the product category");
					String category=sc.next();
					if(isValid(category))
					{
					System.out.println("Enter the hike");
					int hike=sc.nextInt();
					if(hike>0)
					{
					productserviceref.updateProducts(category, hike);	
					map=productserviceref.getProductDetails();
					System.out.println(map);
					}
					else
						throw new ProductException("Hike should be >0");
					}
					else {
						throw new ProductException("Product name does not found");
					}
					break;
					
					
			case 2:System.exit(0);
					break;
			
			}
			
			
		}
	
	}

}
