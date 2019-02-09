package com.capgemini.service;

import java.util.List;

import com.capgemini.beans.Customer;
import com.capgemini.repos.CustomerRepository;
import com.capgemini.repos.InMemoryCustomerRepository;

public class CustomerServiceImpl implements CustomerService{
	
	private CustomerRepository repository;
	
	public CustomerServiceImpl() {
		repository = new InMemoryCustomerRepository();
	}
	
	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	
	@Override
	public boolean delete(int id) {
		return repository.delete(id);
	}
	
	@Override
	public boolean create(Customer c) {
		return repository.create(c);
	}
	
}
