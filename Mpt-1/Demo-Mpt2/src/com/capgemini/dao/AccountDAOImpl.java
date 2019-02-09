package com.capgemini.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.capgemini.beans.Account;
import com.capgemini.beans.Options;

public class AccountDAOImpl implements AccountDao {

	private Map<Integer, Account> accountDetails;

	public AccountDAOImpl() {
		accountDetails = new TreeMap<>();

		Account account1 = new Account();
		account1.setId(1);
		account1.setBalance(2000);
		account1.setName("Akash");
		accountDetails.put(account1.getId(), account1);

		Account account2 = new Account();
		account2.setId(2);
		account2.setBalance(4000);
		account2.setName("suhash");
		accountDetails.put(account2.getId(), account2);

		Account account3 = new Account();
		account3.setId(3);
		account3.setBalance(6000);
		account3.setName("Ramesh");
		accountDetails.put(account3.getId(), account3);

		Account account4 = new Account();
		account4.setId(4);
		account4.setBalance(8000);
		account4.setName("mahesh");
		accountDetails.put(account4.getId(), account4);

	}

	@Override
	public List<Account> findAll() {
		List<Account> accounts = new ArrayList<>(accountDetails.values());
		return accounts;
	}

	@Override
	public List<Account> sortAccountDetails(Options option) {
		List<Account> accounts = new ArrayList<>(accountDetails.values());
		if (option == option.byName) {
			class myComparator implements Comparator<Account> {

				@Override
				public int compare(Account o1, Account o2) {
					// TODO Auto-generated method stub
					return o1.getName().compareTo(o2.getName());
				}

			}
			Collections.sort(accounts, new myComparator());
		} else if (option == option.byId) {
			class myComparator implements Comparator<Account> {

				@Override
				public int compare(Account o1, Account o2) {
					// TODO Auto-generated method stub
					return o1.getId() - o2.getId();
				}

			}

			Collections.sort(accounts, new myComparator());
		}
		return accounts;

	}

	public boolean create(Account newAccount) {
		Account accountRef;
		accountRef = accountDetails.putIfAbsent(newAccount.getId(), newAccount);
		if (accountRef == null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		Account a = accountDetails.remove(id);
		System.out.println(a + " is now removed..");

		if (a != null)
			return true;
		else
			return false;

	}

	@Override
	public boolean update(int id, Account account) {
		// TODO Auto-generated method stub
		
		if(accountDetails.get(id)==null)
			return false;
		accountDetails.put(id, account);
		
		return true;
	}

	@Override
	public Account findById(int id) {
		// TODO Auto-generated method stub
		return accountDetails.get(id);
		
		
		
		
		
	}

}
