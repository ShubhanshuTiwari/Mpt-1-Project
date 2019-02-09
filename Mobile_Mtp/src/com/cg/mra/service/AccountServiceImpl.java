package com.cg.mra.service;

import com.cg.mra.beans.Account;
import com.cg.mra.dao.AccountDaoImpl;

public class AccountServiceImpl implements AccountService {
	private AccountDaoImpl accountdaoimpl;
	public AccountServiceImpl (){
		accountdaoimpl=new AccountDaoImpl();
	}
	
	@Override
	public Account getAccountDetails(String mobileNo) {
		// TODO Auto-generated method stub
		return accountdaoimpl.getAccountDetails(mobileNo);
	}

	@Override
	public int rechargeAccount(String mobileNO, double rechargeAmount) {
		// TODO Auto-generated method stub
		return accountdaoimpl.rechargeAccount(mobileNO, rechargeAmount);
	}

}
