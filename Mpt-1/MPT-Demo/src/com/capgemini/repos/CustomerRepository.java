package com.capgemini.repos;

import java.util.List;

import com.capgemini.beans.Customer;

public interface CustomerRepository {
	List<Customer> findAll();
	
	boolean delete(int id);
	
	boolean create(Customer c);
	
	boolean update(int id, Customer c);
}
