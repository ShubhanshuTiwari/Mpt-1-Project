package com.cg.mra.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.exception.NotfoundException;
import com.cg.mra.beans.Account;

public class AccountDaoImpl implements AccountDao {
	Map<String,Account> accountEntry;
	
	public AccountDaoImpl() {
		accountEntry=new HashMap<>();
		accountEntry.put("9010210131", new Account("Prepaid","Vaishali",200));
		accountEntry.put("9823920123", new Account("Prepaid","megha",453));
		accountEntry.put("9932012345", new Account("Prepaid","vikas",631));
		accountEntry.put("9010210139", new Account("Prepaid","Anju",521));
		accountEntry.put("9010210133", new Account("Prepaid","Tushar",632));
	}

	@Override
	public Account getAccountDetails(String mobileNo) {
		Account flag=accountEntry.get(mobileNo);
		if(flag==null) {
			try {
				throw new NotfoundException(mobileNo);
			} catch (NotfoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return accountEntry.get(mobileNo);
	}

	@Override
	public int rechargeAccount(String mobileNO, double rechargeAmount) {
		// TODO Auto-generated method stub
		Account flag=accountEntry.get(mobileNO);
		if(flag==null) {
			try {
				throw new NotfoundException(mobileNO);
			} catch (NotfoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return 0;
		}
		
		else {
		Account a=accountEntry.get(mobileNO);
		a.setAccountBalance(a.getAccountBalance()+rechargeAmount);
		a=accountEntry.get(mobileNO);
		accountEntry.put(mobileNO, a);
		System.out.println("Hello"+a.getCustomerName()+",Available Balance is"+a.getAccountBalance());
		return 1;
		}
		}
	
	
	
	
	
}
