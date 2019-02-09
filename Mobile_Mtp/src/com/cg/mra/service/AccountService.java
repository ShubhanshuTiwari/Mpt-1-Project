package com.cg.mra.service;

import com.cg.mra.beans.Account;

public interface AccountService {
	Account getAccountDetails(String mobileNo);
	int rechargeAccount(String mobileNO,double rechargeAmount);
}
