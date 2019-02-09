package com.capgemini.dao;

import java.util.List;

import com.capgemini.beans.Account;
import com.capgemini.beans.Options;

public interface AccountDao {
	public List<Account>findAll();
	
	public List<Account> sortAccountDetails(Options option);
		
	public boolean create(Account accountNo);
	public boolean delete(int id);
	public boolean update(int id,Account account);
	public Account  findById(int id);
}
