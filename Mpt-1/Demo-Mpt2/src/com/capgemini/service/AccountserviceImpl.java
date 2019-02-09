package com.capgemini.service;

import java.util.List;

import com.capgemini.beans.Account;
import com.capgemini.beans.Options;
import com.capgemini.dao.AccountDAOImpl;
import com.capgemini.dao.AccountDao;

public class AccountserviceImpl implements AccountService {
	private AccountDao daoref=new AccountDAOImpl();
	public List<Account> findAll(){
		List<Account> accounts=daoref.findAll();
				return accounts;
	}
	@Override
	public List<Account> sortAccountDetails(Options option) {
		// TODO Auto-generated method stub
		return daoref.sortAccountDetails(option);
	}
	@Override
	public boolean create(Account newAccount) {
		// TODO Auto-generated method stub
		return daoref.create(newAccount);
	}
	@Override
	public boolean update(int id, Account account) {
		// TODO Auto-generated method stub
		return daoref.update(id, account);
	}
	@Override
	public Account  findById(int id) {
		// TODO Auto-generated method stub
		return daoref.findById(id);
	}
	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return daoref.delete(id);
	}
	
	
}
