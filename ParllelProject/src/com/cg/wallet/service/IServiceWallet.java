package com.cg.wallet.service;

import com.cg.wallet.bean.CustomerBean;

public interface IServiceWallet {
	public boolean createCustomer(CustomerBean bean);
	public double deposit(double amount);
	public double withdraw(double amount);
	public double showBalance(int pin);
	public boolean fundTransfer();
	public boolean printTranscation();

}
