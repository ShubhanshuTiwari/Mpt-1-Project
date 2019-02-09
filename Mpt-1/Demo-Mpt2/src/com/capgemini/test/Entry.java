package com.capgemini.test;

import java.util.List;

import com.capgemini.beans.Account;
import com.capgemini.beans.Options;
import com.capgemini.service.AccountService;
import com.capgemini.service.AccountserviceImpl;

public class Entry {

	public static void main(String[] args) {
		AccountService service=new AccountserviceImpl();
		List<Account> accounts = service.findAll();

		
		Account newAccount=new Account();
		newAccount.setId(5);
		newAccount.setName("chalesh");
		newAccount.setBalance(10000);
		boolean flag=service.create(newAccount);
		System.out.println("------New account created -->"+flag);
		
		System.out.println("------Details of all account------");
		
		
		for (Account account : accounts) {
			System.out.println(account);
		}
	
		System.out.println("-----Account Sorted by name------");
		accounts=service.sortAccountDetails(Options.byName);
		for (Account account : accounts) {
			System.out.println(account);
		}
		
		System.out.println("-----Account Sorted by Id------");
		accounts=service.sortAccountDetails(Options.byId);
		for (Account account : accounts) {
			System.out.println(account);
		}
		System.out.println("----Delete by id----");
		boolean flag2=service.delete(4);
		
		System.out.println("---Show the element after deletion---");
		accounts = service.findAll();
		for (Account account : accounts) {
			System.out.println(account);
		}
		
		System.out.println("----Updating The details----");
		Account updateAccount=new Account(1,550,"Ram");
		boolean flag3=service.update(1, updateAccount);
		
		System.out.println("---Show the element after updation---");
		accounts = service.findAll();
		for (Account account : accounts) {
			System.out.println(account);
		}
		System.out.println("---Show the element by Id---");
		System.out.println(service.findById(3));
		}
		
		

	}
