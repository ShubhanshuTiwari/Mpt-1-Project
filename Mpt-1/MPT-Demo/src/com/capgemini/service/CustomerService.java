package com.capgemini.service;

import java.util.List;

import com.capgemini.beans.Customer;

public interface CustomerService {

	List<Customer> findAll();
	boolean delete(int id);
	boolean create(Customer c);
}
