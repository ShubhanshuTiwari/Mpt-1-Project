package com.capgemini.repos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.capgemini.beans.Customer;

public class InMemoryCustomerRepository implements CustomerRepository {
	// private List<Customer> customers = new LinkedList<>();

	private Map<Integer, Customer> customerEntries;

	public InMemoryCustomerRepository() {

		customerEntries = new TreeMap<>();

		Customer customer1 = new Customer();
		customer1.setFirstName("Bryan");
		customer1.setLastName("Hansen");
		// customers.add(customer1);
		customerEntries.put(101, customer1);

		Customer customer2 = new Customer();
		customer2.setFirstName("Lisa");
		customer2.setLastName("Ray");
		// customers.add(customer2);
		customerEntries.put(102, customer2);

		Customer customer3 = new Customer();
		customer3.setFirstName("Kathy");
		customer3.setLastName("Sierra");
		// customers.add(customer3);
		customerEntries.put(103, customer3);

		Customer customer4 = new Customer();
		customer4.setFirstName("Kay");
		customer4.setLastName("Horstmann");
		// customers.add(customer4);
		customerEntries.put(104, customer4);
	}

	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>(customerEntries.values());
		System.out.println("-------------------------------------");
		Collections.sort(customers);
		return customers;
	}

	@Override
	public boolean delete(int id) {
		
		Customer c = customerEntries.remove(id);
		System.out.println(c + " is now removed..");
		
		if(c != null)
			return true;
		else
			return false;
	}
	
	int count = 105;
	@Override
	public boolean create(Customer customer) {
		Customer oldValue = customerEntries.put(count++, customer);
		
		if(oldValue == null)
			return true;
		return false;
	}
	
	
	@Override
	public boolean update(int id, Customer c) {
		if(customerEntries.get(id) == null)
			return false;
		customerEntries.put(id,c);
		
		return true;
	}

}
